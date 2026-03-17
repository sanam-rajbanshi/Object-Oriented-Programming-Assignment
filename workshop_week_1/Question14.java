package my_project;
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.print("Enter USD amount: ");
        double usd = user.nextDouble();

        System.out.print("Enter exchange rate: ");
        double rate = user.nextDouble();

        double converted = usd * rate;

        System.out.println("Converted Amount = " + converted);
        
        user.close();
    }

}
