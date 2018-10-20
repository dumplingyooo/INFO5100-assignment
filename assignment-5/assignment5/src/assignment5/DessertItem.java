package assignment5;

public abstract class DessertItem {
	public String name;
	
	public abstract int getCost();
	
	public DessertItem(String name) {
		this.name = name;
	}

}
