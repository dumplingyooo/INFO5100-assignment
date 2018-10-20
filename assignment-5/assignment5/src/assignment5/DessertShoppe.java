package assignment5;

public class DessertShoppe {
	public float tax;
	public String StoreName;
	public int maxSize;
	public float width;
	
	public static String cents2dollarsAndCentsmethod(int cents) {
		int dollar = cents/100;
		int cent = cents % 100;
		
		String money = "";
		
		if (dollar <= 0) {
			if(cent < 10) {
				money = "0"+"."+"0"+cent;
			}
			else {
				money = "0"+"."+cent;
			}
		}
		else {
			if(cent < 10) {
				money = dollar+"."+"0"+cent;
			}
			else {
				money = dollar+"."+cent;
			}
		}
		
		return money;
		
	}

}
