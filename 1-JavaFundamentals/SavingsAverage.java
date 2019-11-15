
/* Perihan Hill
   
   This program asks user to enter the last 3 months savings, 
   and outputs their average_savings.
*/

import java.util.Scanner;

public class SavingsAverage
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    double savings1, savings2, savings3, average_savings;

    System.out.println("Please enter your last 3 months savings, "
    		+ "separated by spaces: ");
    savings1 = scan.nextDouble();
    savings2 = scan.nextDouble();
    savings3 = scan.nextDouble();
    
    average_savings = (savings1 + savings2 + savings3) / 3;

    System.out.printf("Their average_savings is: %.2f \n", average_savings);
  }
}
