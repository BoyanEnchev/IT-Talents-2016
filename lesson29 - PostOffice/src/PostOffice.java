package postoffice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import exceptions.PersonException;

public class PostOffice {
	
	private static final int NUM_BOXES = 25;

	private TreeMap<LocalDate , TreeMap<LocalTime, PostObject>> archive = new TreeMap<LocalDate , TreeMap<LocalTime, PostObject>>
																				((LocalDate d1, LocalDate d2) -> d1.compareTo(d2));
	private List<PostObject> hranilishte = new ArrayList<PostObject>();
	private ConcurrentMap<Integer, ArrayList<PostObject>> boxes = new ConcurrentHashMap<Integer, ArrayList<PostObject>>();
	
	private List<Postman> postmans;
	private List<Collector> collectors;
	
	
	public PostOffice() {
		
	
	}
	
	public void startWork() throws PersonException{
		generateBoxes();
		generatePostmans();
		generateCollectors();
		
		for (int i = 0; i < collectors.size(); i++) {
			new Thread(collectors.get(i)).start();
		}
		for (int i = 0; i < postmans.size(); i++) {
			new Thread(postmans.get(i)).start();
		}
	}


	public void post(PostObject postObj) {
		
		if(postObj != null){
			LocalDate now = LocalDate.now();
			
			if(!archive.containsKey(now)){
				archive.put(now, new TreeMap<LocalTime, PostObject>((LocalTime t1, LocalTime t2) -> t1.compareTo(t2)));
			}
			
			archive.get(now).put(LocalTime.now(), postObj);			
			hranilishte.add(postObj);
			
			System.out.println("ADDED IN POST : " + postObj.toString());
		}
	}



	public void postInBox(Letter letter) {
		System.out.println("ADDED IN BOX: " + letter.toString());
		if(letter != null){
			this.boxes.get(new Random().nextInt(NUM_BOXES)+1).add(letter);
		}
	}
	
	public int getHranilishteSize(){
		return this.hranilishte.size();
	}
	
	private void generateBoxes() {
		
		for (int count = 1; count <= NUM_BOXES; count++) {
			boxes.put(count, new ArrayList<PostObject>());
		}
	}


	private void generateCollectors() throws PersonException {
		this.collectors = new ArrayList<Collector>();
		
		for (int count = 0; count < 5; count++) {
			String firstname = Person.firstNames[new Random().nextInt(Person.firstNames.length)];
			String lastname = Person.lastNames[new Random().nextInt(Person.lastNames.length)];

			this.collectors.add(new Collector(firstname, lastname, this));
		}
	}


	private void generatePostmans() throws PersonException {
		this.postmans = new ArrayList<Postman>();
		
		for (int count = 0; count < 5; count++) {
			String firstname = Person.firstNames[new Random().nextInt(Person.firstNames.length)];
			String lastname = Person.lastNames[new Random().nextInt(Person.lastNames.length)];
			String address = Person.addresses[new Random().nextInt(Person.lastNames.length)];

			this.postmans.add(new Postman(firstname, lastname, this));
		}
	}

	public PostObject getPostObjectToDeliver() {
		if(hranilishte.size() > 0){
			return this.hranilishte.remove(hranilishte.size()-1);
		}else
			return null;
	}


	public boolean boxesIsEmpty() {
		
		for (int boxNumber = 1; boxNumber <= NUM_BOXES; boxNumber++) {
			if(boxes.get(boxNumber).size() > 0){
				return false;
			}
		}
		return true;
	}
	
	public void izprazniBox(){
		int number = new Random().nextInt(NUM_BOXES)+1;
		
		ArrayList<PostObject> objects = this.boxes.get(number);
		
		for (int count = 0; count < objects.size(); count++) {
			synchronized (objects) {
				PostObject post = objects.remove(count);
				System.out.println("COLLECTOR: vzeh " + post.getAddress() + " " + post.getFirstname() + " " + post.getLastname());
			}
			
		}
	}

}
