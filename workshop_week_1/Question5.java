package my_project;
import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		System.out.print("Enter the length of the rectangle : ");
		double length = user.nextDouble();
		
		System.out.print("Enter the width of the rectangle : ");
		double width = user.nextDouble();
		
		double perimeter = 2*(length + width);
		
		System.out.println("Perimeter of Rectangle = " + perimeter);
		
		user.close();
		
		
	}

}
