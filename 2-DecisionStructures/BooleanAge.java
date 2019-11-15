
/* Perihan Hill 
   April 17, 2019
   Demonstrates use of Boolean variables and multi-way if statements.
 */ 
 
import java.util.*; 
  
  public class BooleanAge {
  
   public static void main(String[] args){
     
     int age; 
     boolean UniversityAge;  
     
     Scanner scan = new Scanner(System.in); 
     
     System.out.println("Please enter your age: ");
     age = scan.nextInt(); 
     
   
     if(age>4 && age <11){
    	 
        System.out.println("You can go to kindergarden and elementary school."); 
        UniversityAge = false; 
     }
     
     else if(age>=11 && age < 14)
    	
        System.out.println("It's time to go to middle school");  
        
     else if((age >= 14)&&(age<19)) 
    	 
    	 System.out.println("You can continue your education in high school."); 
     
     else if(age<5)
    	 System.out.println("You are a baby!"); 
     	 
     else 
    	 System.out.println("Now you can go to University!"); 
     
     UniversityAge = age > 18 ; 
     if(UniversityAge) 
        System.out.println("Good luck with your studies!"); 
 
  
     }
   }
   