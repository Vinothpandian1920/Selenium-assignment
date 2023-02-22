package week5day1Assignemet;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop Size");
	}

	public static void main(String[] args) {
		Desktop computer=new Desktop();
		computer.computerModel();
		computer.desktopSize();

	}

}
