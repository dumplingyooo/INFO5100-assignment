import java.util.Arrays;

public class Course {

    String CourseName;
    static int NumberOfStudent;
    static boolean isfull;
    
    Course(String CourseName){
    	this.CourseName = CourseName;
    }

    public static int GetStudent(String[] str) {
    	String CourseStr=Arrays.toString(str);
    	System.out.println("the original student in this course: " + CourseStr);
    	NumberOfStudent = str.length;
    	return NumberOfStudent;
    }
    
    public static boolean isFull(){
    	if(NumberOfStudent < 10) {
    		isfull = false;
    		System.out.println("this course still have seat, you will register for this course.");
    	}
    	else {
    		isfull = true;
    	}
		return isfull;
    }
    
    public static String[] registerStudent(String[] str, String string) {
    	if (isfull == true) {
    		System.out.println("the course is full, you can not register for the class.");
    	}
    	else {
    		String[] NewStu = new String[str.length + 1];
    		
    		for(int i=0;i<str.length;i++)
    		{
    			NewStu[i]=str[i];
    		}		
    		NewStu[str.length] = string;
        	String NewStr=Arrays.toString(NewStu);
    		System.out.println("Now the course has: " + NewStr);
    	}
		return str;
    }
}