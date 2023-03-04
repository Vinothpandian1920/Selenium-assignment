package week5.day2Interface;

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println("deposit my money");
		
	}
public static void main(String[] args) {
	AxisBank bank=new AxisBank ();
	bank.deposit();
	bank.saving();
	bank.fixed();
}

}
