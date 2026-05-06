import java.io.*;
import java.util.*;

// Q5: Take student info from user and save to students.csv
class Student {
    String firstName, lastName, address, contactNumber, semester;

    Student(String firstName, String lastName, String address, String contactNumber, String semester) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.semester = semester;
    }
}

public class Q5_StudentCSV {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.print("How many students? ");
        int count = sc.nextInt();
        sc.nextLine(); // clear buffer

        for (int i = 1; i <= count; i++) {
            System.out.println("\n--- Student " + i + " ---");
            System.out.print("First Name: ");
            String fn = sc.nextLine();
            System.out.print("Last Name: ");
            String ln = sc.nextLine();
            System.out.print("Address: ");
            String addr = sc.nextLine();
            System.out.print("Contact Number: ");
            String contact = sc.nextLine();
            System.out.print("Semester: ");
            String sem = sc.nextLine();

            students.add(new Student(fn, ln, addr, contact, sem));
        }

        // Write to CSV
        BufferedWriter writer = new BufferedWriter(new FileWriter("students.csv"));
        writer.write("FIRST_NAME,LAST_NAME,ADDRESS,CONTACT_NUMBER,SEMESTER");
        writer.newLine();

        for (Student s : students) {
            writer.write(s.firstName + "," + s.lastName + "," + s.address + "," + s.contactNumber + "," + s.semester);
            writer.newLine();
        }
        writer.close();

        System.out.println("\nStudent data saved to students.csv");
        sc.close();
    }
}
