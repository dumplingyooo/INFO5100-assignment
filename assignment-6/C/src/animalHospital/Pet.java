package animalHospital;

public class Pet {
	private String petName;
	private String ownerName;
	private String color;

	public static final int MALE = 1;
	public static final int FEMALE = 2;
	public static final int SPAYED = 3;
	public static final int NEUTERED = 4;
	
	protected int petSex;
	
	
	public Pet(String name, String ownerName, String color) {
		this.petName = name;
		this.ownerName = ownerName;
		this.color = color;
	}
	
	public String getPetName() {
		return petName;
		
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setSex(int sexid) {
		if(sexid >0 && sexid < 4) {
			this.petSex = sexid;
		}
		else {
			System.out.println("Wrong input for pet sex.");
		}
		
	}
	
	public String getSex() {
		if(petSex == MALE) {
			return "MALE";
		}
		if(petSex == FEMALE) {
			return "FEMALE";
		}
		if(petSex == SPAYED) {
			return "SPAYED";
		}
		if(petSex == NEUTERED) {
			return "NEUTERED";
		}
		else {
			return null;
		}
	}
	
	@Override
	public String toString() {
		return  getPetName() + "owned by" +this.getOwnerName() + "\n Color: " + this.getColor() + "\n Sex: " + this.getSex();
	}

}
