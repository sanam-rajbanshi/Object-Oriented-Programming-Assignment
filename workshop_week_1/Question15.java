package my_project;
import java.util.Scanner;

public class Question15 {
	   public static void main(String[] args) {

	        Scanner user = new Scanner(System.in);

	        System.out.print("Enter first integer: ");
	        int a = user.nextInt();

	        System.out.print("Enter second integer: ");
	        int b = user.nextInt();

	        System.out.println("Sum = " + (a + b));
	        System.out.println("Difference = " + (a - b));
	        System.out.println("Product = " + (a * b));
	        System.out.println("Quotient = " + (a / b));
	        user.close();
	    }

}
