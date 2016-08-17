import java.io.IOException;
import java.nio.CharBuffer;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Counter implements Runnable {

	@Override
	public void run() {
		
		for (int index = startIndex; index < endIndex; index++) {
			if(this.text.charAt(index) == ','){
				this.countThreads++;
			}
		}
		
		System.out.println("Az prebroih " + this.countThreads + " zapetaiki");
	}
	public int getCountThreads() {
		return countThreads;
	}
	private int startIndex;
	private int endIndex;
	private String text;
	private int countThreads;

	public Counter(int startIndex, int endIndex, String text){
		this.startIndex = startIndex;
		this.endIndex = endIndex;
		this.text = text;
		this.countThreads = 0;
	}


}
