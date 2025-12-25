import java.util.*;

public class PriorityQueueStackQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(5);
        queue.add(20);

        System.out.println("Queue:");
        while (!queue.isEmpty())
            System.out.print(queue.poll() + " ");

        PriorityQueue<Integer> stack =
                new PriorityQueue<>(Collections.reverseOrder());
        stack.add(10);
        stack.add(5);
        stack.add(20);

        System.out.println("\nStack:");
        while (!stack.isEmpty())
            System.out.print(stack.poll() + " ");
    }
}
