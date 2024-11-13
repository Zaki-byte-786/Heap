import java.util.*;

public class K_largest_subArray_sum {
    static int brute(ArrayList<Integer> arr, int k) {
        // Write your code here
        int n = arr.size();
        List<Integer> sumList = new ArrayList<>();
        for(int i = 0;i < n;i++){
            int sum = 0;
            for(int j = i;j < n;j++){
                sum += arr.get(j);
                sumList.add(sum);
            }
        }
        Collections.sort(sumList,Collections.reverseOrder());
        return sumList.get(k-1);
    }
// 1 2 3  4  5
// 1 3 6 10 15

    static int optimal(ArrayList<Integer> arr, int k){
        PriorityQueue<Integer> minpq = new PriorityQueue<>();
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr.get(j);
                minpq.add(sum);
                if (minpq.size() > k){
                    minpq.poll();
                }
            }
        }
        return minpq.peek();
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int n = array.length;
        int[] psa = new int[n];
        psa[0] = array[0];
        for (int i = 1; i < n; i++) {
            psa[i] = psa[i-1] + array[i];
        }
        System.out.println(Arrays.toString(psa));
    }
}
