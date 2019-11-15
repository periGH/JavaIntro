/* Perihan Hill */
import java.util.Scanner; 

public class WordNumber {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		String word, word1; 
		int number, number1; 
		
		System.out.println("Please enter a word: "); 
		word = scan.nextLine(); 
		
		System.out.println("Please enter a word1 : "); 
		word1 = scan.nextLine(); 
		
		System.out.println("Please enter a number: ");
		number = scan.nextInt(); 
		
		System.out.println("Please enter a number1: "); 
		number1 = scan.nextInt(); 
		
		
		int length = word.length(); 
		int length1 = word1.length(); 
		
		if(length>length1)
			System.out.println("word is longer than word1"); 
		else if(length == length1)
			System.out.println("word is equal to word1"); 
		else
			System.out.println("word1 is longer"); 
		
		if(number>number1)
			System.out.println("number is bigger");
		else if(number == number1)
			System.out.println("they are equal"); 
		else
			System.out.println("number1 is bigger"); 
			

		boolean twoDigitno = (number>=10 && number<100)&&(number1>=10&&number1<100); 

			if(twoDigitno)
				System.out.println("number(" +number+ ") and number1(" +number1+ ") are "
						+ "both two-digit numbers");   
			else
				System.out.println("Neither of number and number1 are two-digit.");  
	}

}
