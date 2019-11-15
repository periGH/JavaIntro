import java.util.*;

public class NestedBrackets {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int width, height; 
		
		System.out.println("Lets create a shape. How wide you want it? "); 
	    width = scan.nextInt(); 
	    System.out.print("and how tall ?");
	    height = scan.nextInt(); 
	    
	    for(int i=1; i<=height; i++)
	    {
	    	for(int j=1; j <=width; j++)
	    		System.out.print("[]"); 
	    	System.out.println(); 
	    }
	  }
  }
