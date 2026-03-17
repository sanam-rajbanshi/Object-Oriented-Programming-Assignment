package my_project;
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = user.nextDouble();

        double area = Math.PI * r * r;

        System.out.println("Area of Circle = " + area);
        user.close();
    }

}
