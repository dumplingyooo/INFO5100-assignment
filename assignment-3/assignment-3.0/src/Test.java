
public class Test {
	

	
	public static void testCourse(String[] str, String string) {
		Course.GetStudent(str);
		Course.isFull();
		Course.registerStudent(str, string);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student Sookie = new student("s", 1002);
		String StudentName = Sookie.getStudentName();
		String[] stu = new String[]{"a","b","c","d","c","d","e"};
		 
		testCourse(stu,StudentName);
	}
}
