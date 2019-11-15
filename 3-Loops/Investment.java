/* Perihan Hill
 * This program calculates the interest earned on an investment over time.
 */

import java.util.Scanner; 
public class Investment {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		double balance; 
		int years = 0; 
		
		System.out.print("Please enter the amount you want to invest: "); 
		balance = scan.nextDouble(); 
		
		while(years < 6) {
		  
		  balance += balance * 0.05; // add 5% interest each year to the balance.
		  
		  years++; 
		  
		  System.out.printf("after %d years passed: %,.2f \n", years, balance); 
			
		}
		System.out.println(); 
		System.out.printf("After 6 years at 5%% interest, " +
				"you'd have $%,.2f \n\n", balance); 
	}
}
