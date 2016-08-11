package weapons;

public abstract class Weapon {

	private int price;
	private int id;
	private static int nextId = 0;
	
	Weapon(int price){
		this.price = price;
		id = ++nextId;
	}
	
	public int getPrice() {
		return price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Weapon other = (Weapon) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
