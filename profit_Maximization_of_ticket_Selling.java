import java.util.*;
public class profit_Maximization_of_ticket_Selling {
    public int solve(ArrayList<Integer> A, int B) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : A){
            pq.add(x);
        }
        int profit = 0;
        while(B > 0 && pq.peek() > 0){
            int curr = pq.poll();
            profit += curr;
            curr--;
            pq.add(curr);
            B--;
        }
        return profit;
    }
}
