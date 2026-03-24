package workshop;

class BankAccount {
    int accountNumber;
    double balance;
    String accountHolderName;
    String accountHolderAddress;

    public BankAccount(int accountNumber, String accountHolderName, String accountHolderAddress, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountHolderAddress = accountHolderAddress;
        this.balance = balance;
    }

   
    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
}


public class question_5 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(982595632, "Sanam", "Gauradaha", 5000.0);

      
        acc.depositMoney(2000.0);  
        
        acc.withdrawMoney(3000.0);  

        acc.withdrawMoney(5000.0);  
    }
}