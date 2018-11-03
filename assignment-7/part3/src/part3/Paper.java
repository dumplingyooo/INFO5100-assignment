package part3;

class Paper extends Tool{

	public Paper(int strength) {
		setStrength(strength);
		type = 'p';
	}
	
	public boolean fight(Tool input) {
		int x = this.getStrength();
		boolean result;
		
		if(input.getType() == 'r') {
			x = 2 * this.getStrength();
		}
		if(input.getType() == 's') {
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
