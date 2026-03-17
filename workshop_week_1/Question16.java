package my_project;

public class Question16 {
	public static void main(String[] args) {
		boolean expression1 = (5>3);
		boolean expression2 = (5>8);
		
		System.out.println("Logical AND : "+ (expression1 && expression2));
		
		boolean expression3 = (5>3);
		boolean expression4 = (5>8);
		
		System.out.println("Logical OR : "+ (expression3 || expression4));
		
		boolean expr5 = !(5 == 10);

        System.out.println("Logical NOT: " + expr5);
		
		
	}

}
