package week3.day2.assignments;

//import week3.day1.assignment.override.BankInfo;

public class MethodOverride {
	public static void main(String args[])
	{
		//AxisBank axisbank = new AxisBank();
		//axisbank.deposit();
		
		BankInfo bank = new AxisBank ();
		bank.fixed();
		bank.saving();
		bank.deposit();
		

	}

}
