package workshop;
class Lamp {

    boolean isOn;

    public Lamp() {
        isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Lamp is now ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Lamp is now OFF");
    }

    public void printStatus() {
        if (isOn) {
            System.out.println("The lamp is currently ON");
        } else {
            System.out.println("The lamp is currently OFF");
        }
    }
}


public class question_6 {
    public static void main(String[] args) {
        Lamp myLamp = new Lamp();

        myLamp.printStatus();  
        myLamp.turnOn();
        myLamp.printStatus();  
        myLamp.turnOff();
        myLamp.printStatus();  
    }
}
