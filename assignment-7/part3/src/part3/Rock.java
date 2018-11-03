package part3;

class Rock extends Tool{
	
	public Rock(int strength){
		setStrength(strength);
		type = 'r';
	}
	
	public boolean fight(Tool input) {
		int x = this.getStrength();
		boolean result;
		
		if(input.getType() == 's') {
			x = 2 * this.getStrength();
		}
		if(input.getType() == 'p') {
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
