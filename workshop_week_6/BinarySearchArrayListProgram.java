package workshop6;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchArrayListProgram {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Collections.sort(list);

        int target = 30;

        int index = Collections.binarySearch(list, target);

        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}