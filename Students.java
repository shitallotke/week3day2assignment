/*
      Class: Students
      Methods: getStudentInfo()
Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
*/
package week3.day2.assignments;

public class Students {
	
	public int getStudentInfo(int id)
	{
		return id;
	}
	public void  getStudenInfo(int id , String name)
	{
		System.out.println("id :" +id + " " + "Name : " +name);
	}
	public String getStudenInfo(String email, long phoneNumber)
	{
		System.out.println("Email :"+ " " +email +"Contact_No : "+phoneNumber );
		return email;
	}

	public static void main(String[] args) {

		Students stud = new Students ();
		System.out.println("id : " +stud.getStudentInfo(10));
		stud.getStudenInfo(20,"Shital");
		stud.getStudenInfo("ssl2@gmail.com", +1414233556);
		
		

	}

}
