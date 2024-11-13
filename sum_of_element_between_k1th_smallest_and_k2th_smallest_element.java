import java.util.*;
public class sum_of_element_between_k1th_smallest_and_k2th_smallest_element {
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)
    {
        // Your code goes here
        PriorityQueue<Long> pq1 = new PriorityQueue<>((a,b)->{
            return Long.compare(b,a);
        });
        PriorityQueue<Long> pq2 = new PriorityQueue<>((a,b)->{
            return Long.compare(b,a);
        });
        for(int i = 0;i < K1;i++){
            pq1.add(A[i]);
        }
        for(int i = 0;i < K2 - 1;i++){
            pq2.add(A[i]);
        }
        for(int i =(int) K1;i < N;i++){
            if(A[i] < pq1.peek()){
                pq1.poll();
                pq1.add(A[i]);
            }
        }
        for(int i =(int) (K2 - 1);i < N;i++){
            if(A[i] < pq2.peek()){
                pq2.poll();
                pq2.add(A[i]);
            }
        }
        long sum1 = 0,sum2 = 0;
        while(!pq1.isEmpty()){
            sum1 += pq1.poll();
        }
        while(!pq2.isEmpty()){
            sum2 += pq2.poll();
        }
        return sum2 - sum1;
    }
}
