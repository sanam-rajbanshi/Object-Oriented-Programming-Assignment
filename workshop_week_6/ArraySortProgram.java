package workshop6;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortProgram {
    public static void main(String[] args) {

        Integer[] arr = {5, 2, 9, 1, 6, 3};

        Arrays.sort(arr);
        System.out.println("Ascending order: " + Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending order: " + Arrays.toString(arr));
    }
}