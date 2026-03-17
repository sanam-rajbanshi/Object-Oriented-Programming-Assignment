package my_project;
import java.util.Scanner;

public class Question11 {
	 public static void main(String[] args) {

	        Scanner user = new Scanner(System.in);

	        System.out.print("Enter miles: ");
	        double miles =user.nextDouble();

	        double km = miles * 1.60934;

	        System.out.println("Kilometers = " + km);
	        user.close();
	 }

}
