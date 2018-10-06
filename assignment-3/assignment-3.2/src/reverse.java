
public class reverse {

	public static String Reverse(String s) {
		
		//String x=new String();
		StringBuffer str = new StringBuffer();
		
		if(s==null) {
			return s;
		}
		else {
			String words[]=s.trim().split("\\s+");
			
			for (int i=words.length-1;i>=0;i--) {
				str.append(words[i] + " ");
				}
			}
		return str.toString();
		}
	
	public static void main (String[] args) {
		
		String s = "the    sky    is   blue";
		System.out.println(Reverse(s));
	}
}
