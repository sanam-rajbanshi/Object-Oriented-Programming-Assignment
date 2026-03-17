package my_project;
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {

        Scanner useer = new Scanner(System.in);

        System.out.print("Enter quantity: ");
        int quantity = useer.nextInt();

        System.out.print("Enter price per item: ");
        double price = useer.nextDouble();

        double total = quantity * price;

        System.out.println("Total Cost = " + total);
        useer.close();
    }

}
