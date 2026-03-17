package workshop_2;
import java.util.Scanner;

public class Question_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter yor marks of physics");
		double physics = input.nextDouble();
		
		System.out.print("Enter yor marks chemistry");
		double chemistry = input.nextDouble();
		
		
		System.out.print("Enter yor marks biology");
		double  biology = input.nextDouble();
		
		System.out.print("Enter yor marks mathematics");
		double  mathematics = input.nextDouble();
		
		System.out.print("Enter yor marks computer");
		double  computer = input.nextDouble();
		
		double marks = physics+chemistry+biology+mathematics+computer;
		double percentage = marks/5;
		
		if (percentage>=90) {
			System.out.println("Grade A");
		}else if (percentage>=80) {
			System.out.println("Grade B");
		}else if (percentage>=70) {
			System.out.println("Grade C");
		}else if (percentage>=60) {
			System.out.println("Grade D");
		}else if (percentage>=40) {
			System.out.println("Grade E");
		}else if (percentage<40) {
			System.out.println("Grade F");
		}
		input.close();
	}
}