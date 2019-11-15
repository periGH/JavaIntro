/* Perihan Hill
 * 
 */
  import java.util.Scanner; 
 

public class OnionBags {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		char numberOfbag; 
		String input; 
		
		System.out.println("Welcome to Best-Deal grocery store.\n"
		  + "Our onion bags are on the sale and limit is 3 for per person.\n"
		  + "1 bag for $3, 2 bags for $5.50, 3 bags for $7.50."
		  + "($4 each bag/regular price)\n"
		  + "Please enter the number of bag you'd like to purchase: ");
		
		input = scan.nextLine();
		numberOfbag = input.charAt(0); 
		
		switch(numberOfbag) {
		
		case '1':
			System.out.println("You saved $1!");
			break;
		case '2':
			System.out.println("You saved $2.50!"); 
			break; 
		case '3':
			System.out.println("You saved $4.50!"); 
				
      break; 
      
		default :
			System.out.println("Don't forget to save this weekend!"
					+ "\nLimit is up to 3 bags per person!"); 
			
	}
  } 
}
