import java.util.*;


public class StackUsingPriorityQueue {

    static class StackNode {
        int data, priority;

        StackNode(int d, int p) {
            data = d;
            priority = p;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<StackNode> stack =
                new PriorityQueue<>((a, b) -> b.priority - a.priority);

        int count = 0;

        stack.add(new StackNode(10, count++));
        stack.add(new StackNode(20, count++));
        stack.add(new StackNode(30, count++));

        System.out.println("Popped Element: " + stack.poll().data);
    }
}
