package assignment5;

public class Cookie extends DessertItem{
	private int number;
	private double pricePerDozen;
	private int cost;
	
	public Cookie(String name, int number, double pricePerDozen) {
		super(name);
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getPricePerDozen() {
		return pricePerDozen;
	}
	
	public int getCost() {
		double price = number * pricePerDozen;
		this.cost = (int)Math.round(price/12);
		return cost;
	}

}
