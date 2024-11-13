import java.util.*;

public class take_gift_from_richest_pile {
    static long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i < gifts.length;i++){
            pq.add(gifts[i]);
        }
        while (k > 0 && pq.peek() > 1){
            int curr = pq.poll();
            curr = (int)Math.sqrt(curr);
            pq.add(curr);
            k--;
        }
        long sum = 0;
        for (int x : pq){
            sum += x;
        }
        return sum;
    }
    public static void main(String[] args) {
        int a = 10;
        int[] array = {1,1,1,1};
        System.out.println(pickGifts(array,4));
    }
}
