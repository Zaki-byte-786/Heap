import java.util.PriorityQueue;
import java.util.*;
public class last_Stone_Weight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i < stones.length;i++){
            pq.add(stones[i]);
        }
        int s1 = 0,s2 = 0;
        while(pq.size() > 1){
            s1 = pq.poll();
            s2 = pq.poll();
            if(s1 != s2){
                pq.add(Math.abs(s1 - s2));
            }
        }
        return pq.size() == 0 ? 0 : pq.peek();
    }
    public static void main(String[] args) {

    }
}
