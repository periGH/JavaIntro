import java.util.Scanner;

/* This program display average of numbers
 * and count them. 
 */
import java.util.Scanner; 

public class AverageOfNumbers {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		int count = 0; 
		double num, sum = 0; 
		
		System.out.print("Please enter a number, or 0 to stop: ");
		num = scan.nextDouble(); 
		
		while(num != 0)
		{
			sum += num;
			System.out.print("Please enter a number, or 0 to stop: "); 
			num = scan.nextDouble(); 
			
			count++; 
		}
		
		System.out.println("You totally entered " + count + " numbers." 
			  +	"The average of numbers is " + sum/count); 
		
	}

}
