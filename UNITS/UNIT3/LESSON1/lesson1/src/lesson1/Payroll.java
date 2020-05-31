package lesson1;

public class Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long hoursWorked = 40;
		double payRate = 10.0, taxRate = 0.10;
		System.out.println("Hours worked: " + hoursWorked);
		System.out.println("Pay amount: " + (hoursWorked*payRate));
		System.out.println("Tax amount: " + (hoursWorked*taxRate*payRate));
		
	}

}
