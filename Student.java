//Multilevel Inheritance
package week3.day2.assignments.org.college;

public class Student extends Department {
	public void studentName(){
		String studName = "Shital";
		System.out.println("Stident Name : "+studName);
	}
	
	public int studentId(int id){
		System.out.println("Student Id : "+id);
		return id;
	}
	
	public void studentDept(String studDept){
		System.out.println("Student Department : "+studDept);
	}

	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank(3);
		
		stud.deptName();
		
		stud.studentName();
		stud.studentId(28);
		stud.studentDept("CSE");
		
	}
	
}
