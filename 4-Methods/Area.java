import java.util.Scanner; 

public class Area {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		int width, length; 
		
		System.out.print("Enter the width of area: "); 
		width = scan.nextInt(); 
		System.out.print("Enter the length of area: ");
		length = scan.nextInt(); 
		
		displayMessage(width , length); 
		
		System.out.println("The area is same: " + width*length); 
		
		
	}
	  public static void displayMessage(int x, int y) {
		  
		  int sum; 
		  sum = x*y; 
		  
		  System.out.println("The area is: " + sum ); 
	  }
	   
}
