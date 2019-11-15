/* Perihan Hill
 */
public class ForLoopArray {
	
	public static void main(String[] args) {
		
		String[] listOfNumbers = { "one" , "two", "three", "four"};
		
		System.out.println("The elements of the array using traditional for loop: "); 
		for(int i=0; i<listOfNumbers.length; i++)
		{
			System.out.print(listOfNumbers[i] + " "); 
		}
		
		System.out.println(); 
		
		System.out.println("The elements of the array using enhanced-for loop: ");
		for(String i : listOfNumbers)
		
			System.out.print(i + " ");
		
		System.out.println();
			
	}
 }
