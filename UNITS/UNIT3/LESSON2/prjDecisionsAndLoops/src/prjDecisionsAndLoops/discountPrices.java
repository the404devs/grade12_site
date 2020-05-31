package prjDecisionsAndLoops;

import java.util.Scanner;

public class discountPrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter price in cents:");
		String input ="";
		Scanner scan = new Scanner(System.in);
		
		input = scan.nextLine();
		double price = Integer.parseInt(input);
		if (price > 1000)
		{
			price = price - (price*0.1);
		}
			
		System.out.println("Discounted Price: "+price);
		scan.close();
	}

}
