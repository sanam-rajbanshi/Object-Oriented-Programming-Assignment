package workshop6;

import java.util.ArrayDeque;

public class PrintQueueProgram {
    public static void main(String[] args) {

        ArrayDeque<String> queue = new ArrayDeque<>();

        queue.add("Document1");
        queue.add("Document2");
        queue.add("Document3");

        System.out.println("After adding 3 documents: " + queue);

        String removed = queue.poll();
        System.out.println("Removed document: " + removed);
        System.out.println("Queue after removal: " + queue);

        queue.add("Document4");
        queue.add("Document5");

        System.out.println("After adding Document4 and Document5: " + queue);

        System.out.println("Next print job (peek): " + queue.peek());

        System.out.println("Final queue: " + queue);
    }
}