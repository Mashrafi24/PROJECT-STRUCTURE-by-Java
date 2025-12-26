import java.util.*;


public class QueueUsingPriorityQueue {

    static class QueueNode {
        int data, priority;

        QueueNode(int d, int p) {
            data = d;
            priority = p;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<QueueNode> queue =
                new PriorityQueue<>((a, b) -> a.priority - b.priority);

        int count = 0;

        queue.add(new QueueNode(10, count++));
        queue.add(new QueueNode(20, count++));
        queue.add(new QueueNode(30, count++));

        System.out.println("Dequeued Element: " + queue.poll().data);
    }
}
