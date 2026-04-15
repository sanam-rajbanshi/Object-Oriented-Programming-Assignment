package workshop6;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListRotateProgram {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int positions = 2;

        Collections.rotate(list, positions);

        System.out.println(list);
    }
}