import java.util.*;
public class Kth_smallest_element {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> maxpq = new PriorityQueue<>((a,b)->{
            return Integer.compare(b,a);
        });
        for(int i = 0; i < k;i++){
            maxpq.add(arr[i]);
        }
        for(int i = k;i < arr.length;i++){
            if(maxpq.peek() > arr[i]){
                maxpq.poll();
                maxpq.add(arr[i]);
            }
        }
        return maxpq.peek();
    }


    // simpler and easy code but more time-consuming


//    public static int kthSmallest(int[] arr, int k) {
//        PriorityQueue<Integer> maxpq = new PriorityQueue<>((a,b)->{
//            return Integer.compare(b,a);
//        });
//        // Your code here
//        for(int i = 0;i < arr.length;i++){
//            maxpq.add(arr[i]);
//            if(maxpq.size() > k){
//                maxpq.poll();
//            }
//        }
//        return maxpq.peek();
//    }
}
