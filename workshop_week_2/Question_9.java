package workshop_2;
import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Take input from user
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        int count = 1;     // To count how many even numbers are added
        int even = 2;      // First even number
        int sum = 0;       // To store sum
        
        // Loop until n even numbers are added
        while (count <= n) {
            sum += even;   // Add current even number
            even += 2;     // Move to next even number
            count++;       // Increase count
        }
        
        // Display result
        System.out.println("Sum of first " + n + " even numbers is: " + sum);
        
        sc.close();
    }
}
