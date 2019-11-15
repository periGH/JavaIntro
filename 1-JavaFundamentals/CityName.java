/* Perihan Hill 
   CityName.java 
   This program asks user first name, last name, city 
   and state. Output them in reverse order.
*/ 

import java.util.Scanner;

public class CityName
{
  public static void main(String[] args)
  {
    String firstName, lastName;
    String city, state; 
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Please enter your first name: ");
    firstName = scan.nextLine();

    System.out.print("Please enter your last name: ");
    lastName = scan.nextLine();
    
    System.out.print("Please enter the city you live: ");
    city = scan.nextLine(); 
    
    System.out.print("Please enter the state you live: ");
    state =scan.nextLine(); 

    System.out.println(state + ", " + city + " -- " + 
        firstName + " " + lastName);
  }
}
