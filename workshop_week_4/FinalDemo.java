package workshop4;

final class FixedClass {
    void show() {
        System.out.println("This is a final class");
    }
}

class Base {
    final void display() {
        System.out.println("Final method in Base class");
    }
}

class Derived extends Base {
    void show() {
        System.out.println("Derived class method");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        FixedClass f = new FixedClass();
        f.show();

        Derived d = new Derived();
        d.display();
        d.show();
    }
}