package workshop6;

import java.util.ArrayList;

public class StudentListProgram {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Ram");
        students.add("Laxman");
        students.add("Satrudhan");
        students.add("Sita");
        students.add("Bharat");

        students.remove("Ram");

        System.out.println("Updated list of participants:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}