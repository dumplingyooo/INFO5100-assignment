package animalHospital;

public class Dog extends Pet implements Boardable {
	private String size;
	
	public Dog(String name, String ownerName, String color, String size) {
		super(name, ownerName, color);
		this.size = size;
	}
	
	public String getSize() {
		return size;
		
	}
	
	@Override
	public String toString() {
		return "DOG: \n" + super.toString() + "\n Hair: " + this.getSize();
	}
	
	private date start;
	private date end;
	
	private class date{
		private int month;
		private int day;
		private int year;
		
		public date(int month, int day, int year) {
			this.month = month;
			this.day = day;
			this.year = year;
		}
		
	}
	
	public void setBoardStart(int month, int day, int year){
		this.start = new date(month, day, year);
	}
	
	public void setBoardEnd(int month, int day, int year) {
		this.end = new date(month, day, year);
	}
	
	public boolean boarding(int month, int day, int year) {
		date boarding = new date(month, day, year);
		
		if(boarding.year < end.year && boarding.year > start.year) {
			return true;
		}
		else if(boarding.year == end.year || boarding.year == start.year) {
			if(boarding.month <end.month && boarding.month > start.month) {
				return true;
			}
			else if(boarding.month == end.month || boarding.month == start.month) {
				if(boarding.day <= end.day && boarding.day >= start.day) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
	}
	
}
