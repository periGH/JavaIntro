/* 
   This program demonstrating behavior of calculations and printf formatting
   with floating point and integer variables.
   
  */  
    import java.util.*;

   public class CalculationFormat {
	
     public static void main(String[] args) {
	   
	    Scanner scan = new Scanner(System.in);
	    int int1, int2;
	    double double1, double2;

	    System.out.print("Enter two integers please, separated by a space: ");
	    int1 = scan.nextInt();
	    int2 = scan.nextInt();

	    System.out.println(int1 + " * " + int2 + " = " + int1 * int2);
	    System.out.println(int1 + " / " + int2 + " = " + int1 / int2);
	    System.out.println(int1 + " % " + int2 + " = " + int1 % int2);

	    System.out.print("Enter two floating-point numbers please, separated by a space: ");
	    double1 = scan.nextDouble();
	    double2 = scan.nextDouble();

	    System.out.println(double1 + " * " + double2 + " = " + double1 * double2);
	    System.out.println(double1 + " / " + double2 + " = " + double1 / double2);
	    System.out.println(double1 + " % " + int2 + " = " + double1 % int2);

	    System.out.println("Formatted calculations 1 digit after the decimal point: ");
	    System.out.printf("%,.1f * %,.1f = %,.1f \n", double1, double2, double1 * double2);
	    System.out.printf("%,.1f / %,.1f = %,.1f \n", double1, double2, double1 / double2);
	    System.out.printf("%,.1f %% %,d = %,.1f \n", double1, int2, double1 % int2);
	    
	    
	  }
	}




