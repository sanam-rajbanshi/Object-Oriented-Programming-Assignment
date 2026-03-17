package my_project;
import java.util.Scanner;

public class Question7 {
	 public static void main(String[] args) {

	        Scanner user = new Scanner(System.in);

	        System.out.print("Enter temperature in Celsius: ");
	        double c = user.nextDouble();

	        double f = c * 9/5 + 32;

	        System.out.println("Temperature in Fahrenheit = " + f);
	        
	        user.close();
	    }

}
