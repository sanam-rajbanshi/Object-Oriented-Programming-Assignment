package workshop4;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(5, 8));
        System.out.println(c.add(10, 15, 20));
        System.out.println(c.add(3.5, 2.7));
        System.out.println(c.add(1.1, 2.2, 3.3));
    }
}