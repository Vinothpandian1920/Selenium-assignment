package week5.day2Interface;

public class Automation extends MultipleLanguage {
	
public void selenium() {
	System.out.println("Selenium");
}
public void java() {
	System.out.println("java");
}
	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}
	public static void main(String[] args) {
		Automation language=new Automation();
		language.java();
		language.python();
		language.ruby();
	}

}
