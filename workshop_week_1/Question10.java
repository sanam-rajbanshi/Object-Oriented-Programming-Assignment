package my_project;
import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		double a = user.nextDouble();
		System.out.print("Enter second number: ");
		double b = user.nextDouble();
		
		System.out.println("Addition of two number : "+ (a+b));
		System.out.println("Subtraction of two number : "+ (a-b));
		System.out.println("Multiplication of two number : "+ (a*b));
		System.out.println("Divison of two number : "+ (a/b));
		
	user.close();
	}

}
