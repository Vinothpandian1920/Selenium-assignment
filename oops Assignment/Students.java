package week5day1Assignemet;

import week5.day1oops.PolyMethodOverLoadingStudentDetails;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("student id :" + id);
	}
	public void getStudentInfo(int id ,String name) {
		System.out.println("student name :"+ name +"," +"student id :" + id);
	}
	public void getStudentInfo( String name,String email,long phoneNumber) {
		System.out.println("student name :"+ name +"," +"student email id is :" + email + "," + "Student Phone number is :" +phoneNumber);
		
	}

	public static void main(String[] args) {
		Students Details=new Students ();
		 Details.getStudentInfo(1234);
		 Details.getStudentInfo(12345,"vinoth");
		 Details.getStudentInfo("vinoth","abcd@gmail.com",123456798L);
		 


}
}
