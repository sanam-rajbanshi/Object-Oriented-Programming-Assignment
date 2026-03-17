package workshop_2;
import java.util.Scanner;

public class question_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Plese enter length .. : ");
		double length = input.nextDouble();
		
		System.out.print("Plese enter length .. : ");
		double Breadth = input.nextDouble();
		
		if(length==Breadth) {
			System.out.println(" It is square");
			
		}else {
			System.out.println(" It is not square");
			
		}
		input.close();
		
		
	}

}

