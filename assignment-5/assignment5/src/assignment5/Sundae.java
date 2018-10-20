package assignment5;

public class Sundae extends IceCream{
	private int cost;
	private String toppingName;
	private int toppingCost;
	
	public Sundae(String name, int cost, String toppingName, int toppingCost) {
		super(name,cost);
		this.toppingName = toppingName;
		this.toppingCost = toppingCost;
		
	}
	
	public String getToppingName() {
		return toppingName;
	}
	
	public int getCost() {
		this.cost = super.getCost() + this.toppingCost;
		return cost;
	}

}
