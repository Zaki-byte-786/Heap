import java.util.*;
public class Magician_and_Chocolates {
    static int optimal(int A, ArrayList<Integer> B){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i < B.size();i++ ){
            pq.add(B.get(i));
        }
        long choc = 0;
        while (A != 0 && pq.size() != 0){
            int max = pq.poll();
            choc += max;
            A--;
            if(max/2 != 0)pq.add(max / 2);
        }
        return (int)(choc%1000000007);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arl = new ArrayList<>();
        for(int i = 0;i < 3;i++){
            //[ 2147483647, 2000000014, 2147483647 ]
            arl.add(2147483647);
            arl.add(2000000014);
            arl.add(2147483647);
        }
            System.out.println(optimal(10,arl));
    }
}
