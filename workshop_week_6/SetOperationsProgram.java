package workshop6;

import java.util.HashSet;

public class SetOperationsProgram {

    public static HashSet<String> performUnion(HashSet<String> a, HashSet<String> b) {
        HashSet<String> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    public static HashSet<String> performIntersection(HashSet<String> a, HashSet<String> b) {
        HashSet<String> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    public static HashSet<String> performDifference(HashSet<String> a, HashSet<String> b) {
        HashSet<String> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }

    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>();
        set1.add("Dog");
        set1.add("Cat");
        set1.add("Elephant");
        set1.add("Lion");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Cat");
        set2.add("Giraffe");
        set2.add("Dog");
        set2.add("Monkey");

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        System.out.println("Union: " + performUnion(set1, set2));
        System.out.println("Intersection: " + performIntersection(set1, set2));
        System.out.println("Difference (Set1 - Set2): " + performDifference(set1, set2));
    }
}