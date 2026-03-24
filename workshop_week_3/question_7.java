package workshop;

class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    // Parameterized Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class question_7 {
    public static void main(String[] args) {
     
        BankAccount acc1 = new BankAccount(12345, "John", 5000.0);
        acc1.display();
    }
}