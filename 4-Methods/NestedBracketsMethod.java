import java.util.Scanner; 

public class NestedBracketsMethod {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		int rows, columns; 
		
		System.out.print("How many rows do you want? ");
		rows = scan.nextInt(); 
		
		System.out.print("How many columns do you want? " );
		columns = scan.nextInt(); 
		
		showBrackets(rows,columns); 
		
	}	
		
		// Draw rectangle of brackets with specified dimensions
		public static void showBrackets(int numRows, int numCols) 
		{
			for(int i=1; i<=numRows; i++)
			{
				for(int j=1; j<=numCols; j++ )
					System.out.print("[]");
				  System.out.println(); 
				
			}
		}
}
