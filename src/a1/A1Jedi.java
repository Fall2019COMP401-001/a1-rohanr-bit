package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numItems = scan.nextInt();
		
		// Initializing arrays
		String[] itemNames = new String[numItems];
		int[] itemTotal = new int [numItems];
		int[] cusTotal = new int [numItems];
		int[] cusItems = new int [numItems];
		double skip = 0.00;
		
		// fill arrays with items and prices
		for (int i=0; i<numItems; i++) {
			itemNames[i] = scan.next();
			skip = scan.nextDouble();
			itemTotal[i] = 0;
			cusTotal[i] = 0;
			cusItems[i] = 0;
		}
		
		int numCustomers = scan.nextInt();
		
		// Initializing arrays for names and costs
		String[] names = new String[numCustomers];
		
		// Initializing variables
		String fName = "";
		String lName = "";
		int cartSize = 0;
		String itemName = "";
		int itemNum = 0;
		
		// For each customer
		for (int i=0; i<numCustomers; i++) {
			fName = scan.next();
			lName = scan.next();
			names[i] = fName + " " + lName;
			cartSize = scan.nextInt();
			for (int j=0; j<numItems; j++) {
				cusItems[j] = 0;
			}
			
			// For each item that the customer adds to their cart
			for (int k=0; k<cartSize; k++) {
				itemNum = scan.nextInt();
				itemName = scan.next();
				
				// To find the price of each item
				for (int l=0; l<numItems; l++) {
					if (itemName.equals(itemNames[l])) {
						if (cusItems[l] == 0) {
							cusItems[l] += 1;
						}
						itemTotal[l] += itemNum;
						l = numItems + 1;
					}
				}
			}
			
			for (int m=0; m<numItems; m++) {
				cusTotal[m] += cusItems[m];
			}
			
			
		}
		for (int n=0; n<numItems; n++) {
			if (itemTotal[n] == 0) {
				System.out.println("No customers bought " + itemNames[n]);
			} else {
				System.out.println(cusTotal[n] + " customer bought " + itemTotal[n] + " " + itemNames[n]);
			}
			
		}
		
	}
}
