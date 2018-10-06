
public class PsychiatristObject {	
	public static void examine(MoodyObject moodyObject) {
		System.out.println("How are you feeling today?");
	}
	public static void observe(MoodyObject moodyObject) {
		moodyObject.queryMood();
		moodyObject.expressFeelings();
	}
	public static void main(String[] args) {
		HappyObject moodyObject1 = new HappyObject();
		SadObject moodyObject2 = new SadObject();
		examine(moodyObject1);
		observe(moodyObject1);	
		examine(moodyObject2);
		observe(moodyObject2);	
	}
}
