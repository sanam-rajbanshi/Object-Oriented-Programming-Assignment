package workshop_2;
import java.util.Scanner;

public class Question_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your marks : ");
		double marks = input.nextDouble();
		
		if ((marks>100) || (marks<0)) {
			System.out.println("Wrong marks");
		}else if((marks>=90) && (marks<=100)) {
			System.out.println(" Your grade is A+ ");
			
		}else if ((marks>=80) && (marks<=90)) {
			System.out.println(" Your grade is A ");
		}else if ((marks>=70) && (marks<=80)) {
			System.out.println(" Your grade is B+ ");
		}else if ((marks>=60) && (marks<=70)) {
			System.out.println(" Your grade is B ");
		}else if ((marks>=50) && (marks<=60)) {
			System.out.println(" Your grade is C+ ");
		}else if ((marks>=40) && (marks<=50)) {
			System.out.println(" Your grade is C ");
		}else {
			System.out.println(" You'r fail");
		}
		input.close();
	}
}
