package workshop_2;
import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Take input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Check if number is even or odd
        if (num % 2 == 0) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }
        
        sc.close();
    }
}
