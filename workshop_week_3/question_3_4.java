package workshop;

class bankacount{
	int accountNumber;
	double balance ;
	String accountHolderName;
	String accountHolderAddress;
	
public class question_3_4 {
	public static void main(String[] args) {
		bankacount acc = new bankacount();
		acc.accountNumber = 982595632;
		acc.balance = 9999999.000;
		acc.accountHolderName = "Sanam";
		acc.accountHolderAddress = "Gauradaha";
		
		System.out.println("Account Number " + acc.accountNumber);
		System.out.println("Balance " + acc.balance);
		System.out.println("Account holder name " + acc.accountHolderName);
		System.out.println("Account Holder Number " + acc.accountHolderAddress);
	}
}

}
