package workshop4;

import java.util.Scanner;

public class AZASignupApp {

    static Scanner sc = new Scanner(System.in);

  
    static String[] names = new String[100];
    static String[] mobiles = new String[100];
    static String[] passwords = new String[100];
    static String[] dobs = new String[100];
    static int userCount = 0;

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nPlease enter 1 for Sign up.");
            System.out.println("Please enter 2 for Quit.");

            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                signup();
            } else if (choice == 2) {
                System.out.println("\nThank you for using the Application.");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static void signup() {

        String name, mobile, password, confirmPassword, dob;

        while (true) {

            
            System.out.print("\nPlease enter your full name: ");
            name = sc.nextLine();
            if (name.length() <= 4) {
                System.out.println("Name must be more than 4 characters. Please start again.");
                continue;
            }

            
            System.out.print("Please enter your mobile number: ");
            mobile = sc.nextLine();
            if (!mobile.matches("0\\d{9}")) {
                System.out.println("Mobile number must be 10 digits and start with 0. Please start again.");
                continue;
            }

            
            System.out.print("Please enter your password: ");
            password = sc.nextLine();
            if (!password.matches("[A-Za-z]+[@&]\\d+")) {
                System.out.println("Password must start with letters, include @ or &, and end with numbers.");
                System.out.println("Example: John@123");
                continue;
            }

           
            System.out.print("Please confirm your password: ");
            confirmPassword = sc.nextLine();
            if (!password.equals(confirmPassword)) {
                System.out.println("Your passwords are not matching.");
                System.out.println("Please start again.");
                continue;
            }

            
            System.out.print("Please enter your Date of Birth (DD/MM/YYYY): ");
            dob = sc.nextLine();

            if (!dob.matches("\\d{2}/\\d{2}/\\d{4}")) {
                System.out.println("You have entered the Date of Birth in invalid format.");
                System.out.println("Please start again.");
                continue;
            }

            
            int year = Integer.parseInt(dob.substring(6));
            int age = 2026 - year;

            if (age < 21) {
                System.out.println("You must be at least 21 years old.");
                System.out.println("Please start again.");
                continue;
            }

            
            names[userCount] = name;
            mobiles[userCount] = mobile;
            passwords[userCount] = password;
            dobs[userCount] = dob;
            userCount++;

            System.out.println("\nYou have successfully signed up.");
            break;
        }
    }
}