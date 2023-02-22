package week5day1Assignemet;

public class Student extends Deportment {
	public void studentName() {
		System.out.println(" print the student name");
	}
    public void studentDept() {
    	System.out.println("print student Dept");
	
}
    public void studentId() {
    	System.out.println("print student id");
    }
    public static void main(String[] args) {
    	Student details=new Student();
    	details.studentDept();
    	details.studentId();
    	details.studentName();
    	details.collegecode();
    	details.collegeName();
    	details.collegerank();
    	details.deptName();
	}
}
