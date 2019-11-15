/* Perihan Hill
   AvgSavings.java
   3/6/2019

   This program demonstrates how to use a type cast 
   to divide to integers and get a floating point result.
*/

import java.util.Scanner;

public class AvgSavings
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner (System.in);
      int num_customer, num_savings;
      double total_savings; 
      double avg_savingsAccount,avg_customerSavings;

      System.out.print("How many customers are in the bank? ");
      num_customer = scan.nextInt();
      System.out.print("and how many of them have savings account? ");
      num_savings = scan.nextInt();
      
      System.out.print("How much money total is in the savings accounts of this bank? $");
      total_savings = scan.nextDouble();
      
      avg_savingsAccount = (double)num_customer / num_savings;

      System.out.printf("The average savings account number in this bank "
          +"is %.2f.\n",  avg_savingsAccount);
      
      avg_customerSavings = total_savings / (double)num_savings; 
      
      System.out.printf("The average customer savings "
          +"is $%.2f.\n",  avg_customerSavings);     
     
  }
}

