import java.util.*;

class MyDeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addFirst(12);
        dq.addLast(5);
        dq.peekFirst();klhkj

        System.out.println(dq);

        System.out.println("First: " + dq.peekFirst());
        System.out.println("Last: " + dq.peekLast());

        dq.removeFirst();
        dq.removeLast();

        System.out.println(dq);
    }
}