package part3;

class Scissors extends Tool{

	public Scissors(int strength) {
		setStrength(strength);
		type = 's';
	}
	
	public boolean fight(Tool input) {
		int x = this.getStrength();
		boolean result;
		
		if(input.getType() == 'p') {
			x = 2 * this.getStrength();
		}
		if(input.getType() == 'r') {
			x = this.getStrength() / 2;
		}
		
		if(x <= input.getStrength()) {
			result = false;
		}
		else {
			result = true;
		}
		return result;
	}

}
