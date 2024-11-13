import java.util.*;
public class Minimum_Cost_of_ropes {
    static long optimal(long[] array){
        long cost = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i = 0;i < array.length;i++){
            pq.add(array[i]);
        }

        while(pq.size() != 1){
            long a = pq.poll();
            long b = pq.poll();
            cost += a + b;
            pq.add(a + b);
        }
        return cost;
    }
    public static void main(String[] args) {

    }
}
