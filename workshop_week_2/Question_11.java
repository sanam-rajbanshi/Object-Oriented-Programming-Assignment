package workshop_2;
import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Take input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        long factorial = 1;  // Use long to handle larger values
        
        // Calculate factorial using for loop
        for (int i = 1; i <= num; i++) {
            factorial *= i;   // factorial = factorial * i
        }
        
        // Display result
        System.out.println("Factorial of " + num + " is: " + factorial);
        
        sc.close();
    }
}