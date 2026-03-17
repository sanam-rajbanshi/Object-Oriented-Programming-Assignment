package my_project;
import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		
		System.out.print("Enter side a : ");
		double a = user.nextDouble();
		
		System.out.print("Enter side b : ");
		double b = user.nextDouble();
		
		System.out.print("Enter side c : ");
		double c = user.nextDouble();
		
		double s = (a+b+c)/2;
            
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		
		System.out.println("Area of triangle : " + area);
		
		user.close();
		
		
		
	}
}