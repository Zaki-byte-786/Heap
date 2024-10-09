import java.util.*;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(5);
        pq.add(4);
        System.out.println(pq);
        pq.remove(1);
        System.out.println(pq);

    }
}
