package workshop6;

import java.util.LinkedList;

public class LinkedListInsertProgram {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        if (list.isEmpty()) {
            System.out.println("The linked list is empty.");
        }

        list.addFirst("Alpha");
        list.addLast("Beta");
        list.addFirst("Gamma");
        list.addLast("Delta");

        if (!list.isEmpty()) {
            System.out.println("The linked list is not empty.");
        }

        System.out.println("Elements in the linked list:");
        for (String name : list) {
            System.out.println(name);
        }
    }
}