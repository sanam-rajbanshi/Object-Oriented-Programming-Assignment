package workshop;

class Bankaccount {
    private double balance;

    Bankaccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

public class question_10 {
    public static void main(String[] args) {
        Bankaccount acc = new Bankaccount(999.9);
        System.out.println("Your balance " + acc.getBalance());
    }
}
