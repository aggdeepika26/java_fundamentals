package les3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        System.out.println("Queue  " + queue);
        String frontElement = queue.peek();
        System.out.println("Front Element " + frontElement);
        String removedElement = queue.poll();
        System.out.println("Removed Element " + removedElement);
        System.out.println("Updated Queue" + queue);
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Queue Empty " + isEmpty);

        int size = queue.size();
        System.out.println("Size of queue " + size);
    }
}



