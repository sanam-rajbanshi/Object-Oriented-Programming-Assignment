package workshop6;

import java.util.LinkedList;
import java.util.Collections;

public class LinkedListColorsProgram {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();

        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Red");
        colors.add("Orange");

        for (String c : colors) {
            System.out.println(c);
        }

        if (colors.contains("Red")) {
            System.out.println("Red exists");
        } else {
            System.out.println("Red does not exist");
        }

        Collections.shuffle(colors);
        System.out.println(colors);

        Collections.sort(colors);
        System.out.println(colors);
    }
}