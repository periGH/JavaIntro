/* Perihan Sahan Hill
 * This program demonstrates i/o, calculations and if-statement
 * 
 * Interest Program
   Allows user to enter the amount of an investment.
   Investments under $30,000 earn 3% interest, and investments equal to
   or above $30,000 earn 4% interest.  The dollar amount of interest
   earned is output by the program.
 */
import java.util.Scanner; 

public class Interest {
	
	public static void main(String[] args) {
		
		double amountOfInvestment, amountOfEarned; 
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("Welcome to Bank of Investment\nEnter amount you want to invest: "); 
		amountOfInvestment = scan.nextDouble(); 
		
		if(amountOfInvestment < 30000.0)
		   amountOfEarned = amountOfInvestment * 0.03; // 3% interest
		
		else
		   amountOfEarned = amountOfInvestment * 0.05; // 5% interest
		
		System.out.println("You earn $" + amountOfEarned + " from your investment in one year."); 
		
	}
}
