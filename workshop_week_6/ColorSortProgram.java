package workshop6;

import java.util.ArrayList;
import java.util.Collections;

public class ColorSortProgram {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        Collections.sort(colors);
        System.out.println("Ascending order: " + colors);

        Collections.sort(colors, Collections.reverseOrder());
        System.out.println("Descending order: " + colors);
    }
}