package workshop_2;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Ask user for input
        System.out.print("Do you have a medical cause? (y/n): ");
        char choice = sc.next().charAt(0);
        
        // Check condition
        if (choice == 'y' || choice == 'Y') {
            System.out.println("You are not allowed to sit in the exam.");
        } 
        else if (choice == 'n' || choice == 'N') {
            System.out.println("You can sit in the exam.");
        } 
        else {
            System.out.println("Invalid input. Please enter 'y' or 'n'.");
        }
        
        sc.close();
    }
}
