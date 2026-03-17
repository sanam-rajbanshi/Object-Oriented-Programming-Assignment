package my_project;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = user.nextDouble();

        System.out.print("Enter height: ");
        double h = user.nextDouble();

        double volume = Math.PI * r * r * h;

        System.out.println("Volume of Cylinder = " + volume);
        
        user.close();
    }
}
