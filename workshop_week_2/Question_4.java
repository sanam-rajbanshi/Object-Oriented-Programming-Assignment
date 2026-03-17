package workshop_2;

import java.util.Scanner;

public class Question_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter yor age");
		int age = input.nextInt();
		
		
		if(age<0) {
			System.out.println("Not valid age");
		}else if(age>=1 && age<40) {
			System.out.println("Younger");
		}else{
			System.out.println("Older");
		}
		input.close();
	}

}
