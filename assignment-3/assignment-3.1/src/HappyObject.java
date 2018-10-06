
public class HappyObject extends MoodyObject{
	
	protected String getMood() {
		return "happy";
	}

	@Override
	protected void expressFeelings() {
		System.out.println("hahahahaha...");		
	}	
	public String toString() {
		return "Subject laughs a lot";
	}
}
