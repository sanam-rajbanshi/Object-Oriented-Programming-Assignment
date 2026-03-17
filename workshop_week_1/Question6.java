package my_project;
import java.util.Scanner;

public class Question6 {
	public static void main(String[] args){
	
	Scanner user = new Scanner(System.in);
	
	System.out.print("Enter side of square: ");
    double side = user.nextDouble();

    double area = side * side;

    System.out.println("Area of Square = " + area);
    
    user.close();
	}


}
