package week3.day2.assignments;

public class Desktop extends Computer {
	
	public void desktopSize() {
		
		System.out.println("Sub clas method : desktopSize");
	}

	public static void main(String[] args) {
		
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopSize();
	}

}
