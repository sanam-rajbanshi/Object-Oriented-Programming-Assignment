package workshop_2;
import java.util.Scanner;

public class Question_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number for which you need table : ");
		int num = input.nextInt();
		
		for(int i = 1; i<=10; i++) {
			System.out.println(num + "x" + i + "=" + (num*i));
			
		}
		input.close();
	}
}
