/* Perihan Hill
 * This program outputs "apple" to user as many times as specified.
 * Ask a user how many times to repeat the word, then use a loop to
 * output it that many times. 
 */

import java.util.Scanner; 
public class Apples {
	
	public static void main(String[] args) {
	  
		Scanner scan = new Scanner(System.in); 
		int numApples; 
		
		System.out.print("How many apples? "); 
		numApples = scan.nextInt(); 
		
		while(numApples > 0) {
			
			if(numApples % 2 == 0)
				System.out.println("apple"); 
			else
				System.out.println("APPLE"); 
			
			numApples--; 
		}
	}
}
