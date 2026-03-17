package workshop_2;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = input.nextInt();   // use 

		if (num % 2 == 0) {

			if (num % 4 == 0) {
				System.out.println("Even and divisible by 4");
			} else {
				System.out.println("Even but NOT divisible by 4");
			}

		} else {

			if (num % 7 == 0) {
				System.out.println("Odd and divisible by 7");
			} else {
				System.out.println("Odd and NOT divisible by 7");
			}
		}

		input.close();
	}
}
