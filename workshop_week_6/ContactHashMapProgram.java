package workshop6;

import java.util.HashMap;

public class ContactHashMapProgram {
    public static void main(String[] args) {

        HashMap<String, String> contacts = new HashMap<>();

        contacts.put("Alex", "9812345678");
        contacts.put("Brian", "9801112233");
        contacts.put("Clara", "9845678901");
        contacts.put("David", "9876543210");

        System.out.println("Contact List:");
        System.out.println(contacts);
    }
}