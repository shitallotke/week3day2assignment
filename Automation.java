package week3.day2.assignments;

public class Automation extends MultipleLangauge implements Language,TestTool {

	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.python();
		obj.Java();
		obj.ruby();
		obj.Selenium();

	}

	public void Selenium() {
		
		System.out.println("Selenium");
	}

	public void Java() {
		
		System.out.println("Java");
	}

	@Override
	public void ruby() {
		
		System.out.println("Ruby");
	}

}
