
public class SadObject extends MoodyObject {
	
	protected String getMood() {
		return "sad";
	}
	
	@Override
	public void expressFeelings() {
		System.out.println("wah...");
	}
	public String toString() {
		return "Subject cries a lot";
	}	
}
