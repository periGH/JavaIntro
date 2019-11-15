
/* Perihan Sahan

   This program demonstrates passing 
   user array inputs to a method.
  */ 
  
import java.util.Scanner; 
   
public class ArrayMethod 
{
  public static void main(String[] args)
  {
    int[] num = new int[3]; 
    
    Scanner scan = new Scanner(System.in); 
    
  System.out.println("Enter 1st number: "); 
  num[0] = scan.nextInt(); 
  
  System.out.println("Enter 2nd number: "); 
  num[1] = scan.nextInt(); 
  
  System.out.println("Enter 3rd number: "); 
  num[2] = scan.nextInt(); 
  
   
  OutLine();
  
  for(int index=0; index<num.length; index++)
     
     showValue(num[index]); 
  }
  
  public static void OutLine()
  {
   System.out.println("You entered:");
  }
   
  public static void showValue(int n)
  {
    System.out.println( n + " "); 
    
  }
 }         

  
   