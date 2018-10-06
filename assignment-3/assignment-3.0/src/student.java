public class student {

    private String StudentName;
    private long StudentID;
    
    student(String StudentName, long StudentID){
    	this.StudentName = StudentName;
    	this.StudentID = StudentID;
    }
    
    public String getStudentName() {
      return StudentName;
    }
  
    public void setStudentName(String StudentName) {
      this.StudentName = StudentName;
    }
    
    public long getStudentID() {
      return StudentID;
    }

    public void setStudentID(long StudentID) {
      this.StudentID = StudentID;
    }
    
}