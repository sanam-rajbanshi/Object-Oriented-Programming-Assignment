package my_project;
import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = user.nextDouble();

        System.out.print("Enter Rate: ");
        double r = user.nextDouble();

        System.out.print("Enter Time: ");
        double t = user.nextDouble();

        double interest = (p * r * t) / 100;

        System.out.println("Simple Interest = " + interest);
        
        user.close();
    }

}
