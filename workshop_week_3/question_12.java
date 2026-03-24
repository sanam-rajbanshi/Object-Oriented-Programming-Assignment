class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class Customer {
    private int customerId;
    private String name;
    private BankAccount account;

    Customer(int customerId, String name, BankAccount account) {
        this.customerId = customerId;
        this.name = name;
        this.account = account;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class question_12 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(5000);
        BankAccount acc2 = new BankAccount(8000);

        Customer c1 = new Customer(1, "John", acc1);
        Customer c2 = new Customer(2, "Alice", acc2);

        System.out.println("Customer 1 ID: " + c1.getCustomerId());
        System.out.println("Customer 1 Name: " + c1.getName());
        System.out.println("Customer 1 Balance: " + c1.getAccount().getBalance());

        System.out.println();

        System.out.println("Customer 2 ID: " + c2.getCustomerId());
        System.out.println("Customer 2 Name: " + c2.getName());
        System.out.println("Customer 2 Balance: " + c2.getAccount().getBalance());

        c1.setName("Mike");
        System.out.println();
        System.out.println("Updated Customer 1 Name: " + c1.getName());
    }
}
