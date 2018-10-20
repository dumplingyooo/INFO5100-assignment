package assignment5;

//import assignment5.DessertShoppe; 

public class Checkout {
	private int numberOfItems;
	private DessertItem[] dessertItem = new DessertItem[100];;
	
	public Checkout(){
		numberOfItems = 0;	
	}
	
	public void enterItem(DessertItem Dessert) {
		this.dessertItem[numberOfItems] = Dessert;
		numberOfItems ++;
	}
	
	public int numberOfItems() {
		return numberOfItems;
		
	}
	
	public int totalCost() {
		int cost = 0;
		for(int i = 0; i < numberOfItems; i++) {
			cost += this.dessertItem[i].getCost();
			}
		return cost;
		
	}
	
	public int totalTax() {
		double tax = 0;
		tax = this.totalCost() * 0.02;  //set tax rate at 2.0% == 0.02
		int taxRound = (int) Math.round(tax);
		return taxRound;
		
	}
	
	public void clear() {
		for(int i = 0; i < numberOfItems; i++) {
			dessertItem[i] = null;
		}
		numberOfItems = 0;
	}
	
	public String toString() {
		
		String tip = "";
		String start = "```";
		
/*		String numberline = "Number of items: ";
		tip += start + "\n" + numberline + numberOfItems +"\n";
		
		String costline = "Total Cost: ";
		tip += costline + this.totalCost() + "\n";
	
		String taxline = "Total tax: ";
		tip += taxline + this.totalTax() + "\n";
		*/
		
		tip += start + "\n" + "M & M Dessert Shoppe" + "\n";
		tip += "--------------------" + "\n";
		
		for(int i = 0; i < numberOfItems; i++) {
			String x = dessertItem[i].name;
			int money = dessertItem[i].getCost();
			String y = DessertShoppe.cents2dollarsAndCentsmethod(money);
			
			//check contain to which type by use instanceof
			if(dessertItem[i] instanceof Candy) {
				tip += ((Candy)dessertItem[i]).getWeight()+ "lbs. @ " + ((Candy)dessertItem[i]).getPricePerPound() + "/lb." + "\n" + x + "    " + y + "\n";
			}
			if(dessertItem[i] instanceof Cookie) {
				tip += ((Cookie)dessertItem[i]).getNumber() + " @ " + ((Cookie)dessertItem[i]).getPricePerDozen() + "/dz." + "\n" + x + "   " + y + "\n";
			}
			if(dessertItem[i] instanceof IceCream) {
				tip += x + "     " + y + "\n";
			}
			if(dessertItem[i] instanceof Sundae) {
				tip +=((Sundae)dessertItem[i]).getToppingName() + " Sundae with" + "\n" + x + "     " + y + "\n";
			}

		}
		String finalTax = "Tax";
		String taxRound = DessertShoppe.cents2dollarsAndCentsmethod(this.totalTax());
		tip += "\n" + finalTax + "        " +taxRound + "\n";
		
		String finalCost = "Toal Cost";
		String costRound = DessertShoppe.cents2dollarsAndCentsmethod(this.totalCost());
		tip += finalCost +"      " + costRound + "\n";

		return tip;
		
	}

} 
