package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numItems = scan.nextInt();
		
		// Initialize arrays
		String[] itemNames = new String [numItems];
		double[] itemPrices = new double [numItems];
		
		// Intaking values for arrays
		for (int i=0; i<numItems; i++) {
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
		
		// Intaking number of customers
		int numCustomers = scan.nextInt();
		
		// Initializing arrays for customers and costs
		String[] names = new String[numCustomers];
		double[] totalCosts = new double[numCustomers];
		
		// Initializing variables
		String fName = "";
		String lName = "";
		int cartSize = 0;
		double totalCost = 0.00;
		String itemName = "";
		int itemQuant = 0;
		
		// Intaking customer values
		for (int i=0; i<numCustomers; i++) {
			fName = scan.next();
			lName = scan.next();
			names[i] = fName + " " + lName;
			cartSize = scan.nextInt();
			totalCost = 0.00;
			
			// Intaking items from the customers cart
			for (int j=0; j<cartSize; j++) {
				itemQuant = scan.nextInt();
				itemName = scan.next();
			
					// Intaking the price of each item
					for (int k=0; k<numItems; k++) {
						if(itemName.equals(itemNames[k])) {
							totalCost += (itemQuant*itemPrices[k]);
							k = numItems+1;
						}
					}	
							
				}
		totalCosts[i]=totalCost;
		
	}
		
	// Calculate max cost
		
	double maxCost = findValueMax(totalCosts);
	String maxSpender = "";
	for (int h=0; h<numCustomers; h++) {
		if(maxCost == (totalCosts[h])) {
			maxSpender = names[h];
		}
	}
	
	System.out.println("Biggest: " + maxSpender + " ("+String.format("%.2f",maxCost)+")");
	
	// Calculate min cost
	
	double minCost = findValueMin(totalCosts);
	String minSpender = "";
	for (int r=0; r<numCustomers; r++) {
		if(minCost == (totalCosts[r])) {
			minSpender = names[r];
		}
	}
	
	System.out.println("Smallest: " + minSpender + " ("+String.format("%.2f",minCost)+")");
	
	// Calculate average
	double avgCost = (calculateValueSum(totalCosts)/numCustomers);
	System.out.println("Average: " +String.format("%.2f",avgCost));
}
	
	/* calculateValueSum 
	 * Calculates the sum on an array of integers
	 *
	 * Input: array of integers vals
	 * 
	 * Output: integer sum of values in vals
	 * 
	 * Preconditions:
	 * Input array must not be null.
	 */
	
	static double calculateValueSum(double[] vals) {
		
		double sum = 0;
		
		for (int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		
		return sum;
	}
	
	/* findValueMin
	 * Finds and returns the minimum value in an array of integers
	 * 
	 * Input: array of integers vals
	 * 
	 * Output: minimum value found within the array
	 * 
	 * Preconditions:
	 * Input array must not be null and must contain at least one value.
	 */
	
	static double findValueMin(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_min = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
			}
		}
		
		return cur_min;
	}

	/* findValueMax
	 * Finds and returns the maximum value in an array of integers
	 * 
	 * Input: array of integers vals
	 * 
	 * Output: maximum value found within the array
	 * 
	 * Preconditions:
	 * Input array must not be null and must contain at least one value.
	 */
	
	static double findValueMax(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_max = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
			}
	
		}
		
		return cur_max;
	}
}