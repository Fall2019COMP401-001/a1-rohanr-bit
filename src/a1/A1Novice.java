package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Create a count for number of customers
		
		int countCus = scan.nextInt();
		
		// Initializing variables for customers
		
		String fName = "";
		String lName = "";
		int numItems = 0;
		int items = 0;
		double price = 0.00;
		double totalCost = 0.00;
		String itemName = "";
		
		// Intaking values for customer variables
		
		for (int i=0; i<countCus; i++) {
			totalCost = 0.00;
			fName = scan.next();
			lName = scan.next();
			numItems = scan.nextInt();

		
		// When a customer purchases an item
			
		for (int j=0; j<numItems; j++) {
			items = scan.nextInt();
			itemName = scan.next();
			price = scan.nextDouble();
			totalCost += (items*price);
		}
		
		// Print the totals for each customer
		
		String answer = fName.charAt(0) + ". " + lName + ": " + String.format("%.2f", totalCost);
		System.out.println(answer);
		
		}
	}
}
