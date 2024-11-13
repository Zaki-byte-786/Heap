import java.util.*;
public class Kth_largest_element_in_stream {
//    static int[] kthLargest(int k, int[] arr, int n) {
//        // code here
//        PriorityQueue<Integer> minpq = new PriorityQueue<>();
//        int[] ans = new int[n];
//        for(int i = 0;i < k;i++){
//            minpq.add(arr[i]);
//            ans[i] = i < k-1 ? -1 : minpq.peek();
//        }
//        for(int i = k;i < n;i++){
//            if(minpq.peek() < arr[i]){
//                minpq.poll();
//                minpq.add(arr[i]);
//            }
//            ans[i] = minpq.peek();
//        }
//        return ans;
//    }

    // leetcode solution

    int K;
    PriorityQueue<Integer> minpq = new PriorityQueue<>();
    public Kth_largest_element_in_stream(int k, int[] nums) {
        K = k;
        for(int i = 0;i < nums.length;i++){
            minpq.add(nums[i]);
            if(minpq.size() > k){
                minpq.poll();
            }
        }
    }

    public int add(int val) {
        minpq.add(val);
        if(minpq.size() > K){
            minpq.poll();
        }
        return minpq.peek();
    }
}
