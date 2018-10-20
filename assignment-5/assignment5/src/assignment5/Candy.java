package assignment5;

public class Candy extends DessertItem {
	private double weight;
	private double pricePerPound;
	private int cost;	
	
	public Candy(String name, double weight, double pricePerPound) {
		super(name);
		this.weight = weight; 
		this.pricePerPound = pricePerPound;
		
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getPricePerPound() {
		return pricePerPound;
	}
	
	public int getCost() {
		double price = this.weight * this.pricePerPound;
		this.cost = (int) Math.round(price);
		return cost;
	}

}
