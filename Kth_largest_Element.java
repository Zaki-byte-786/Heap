import java.util.PriorityQueue;

public class Kth_largest_Element {
    // O(NlogN) solution

//        void swap(int[] heap,int i,int max){
//            heap[i] = heap[i] + heap[max];
//            heap[max] = heap[i] - heap[max];
//            heap[i] = heap[i] - heap[max];
//        }
//        void heap(int[] heap,int i,int size){
//            while (i <= size){
//                int max = i;
//                int left = 2 * i + 1,right = 2 * i + 2;
//                if (left <= size && heap[left] > heap[i])max = left;
//                if (right <= size && heap[right] > heap[max]) max = right;
//                if (max == i)break;
//                swap(heap,i,max);
//                i = max;
//            }
//        }
//        void sort(int[] array){
//            int n = array.length;
//            for (int i = n/2 - 1; i >= 0 ; i--) {
//                heap(array,i,n-1);
//            }
//            int size = n - 1;
//            while (size > 0){
//                swap(array,0,size);
//                size--;
//                heap(array,0,size);
//            }
//        }
//        public int findKthLargest(int[] nums, int k) {
//            sort(nums);
//            return nums[nums.length-k];
//        }

    // O(

        void swap(int[] heap,int i,int max){
            heap[i] = heap[i] + heap[max];
            heap[max] = heap[i] - heap[max];
            heap[i] = heap[i] - heap[max];
        }
        void heap(int[] heap,int i,int size){
            while (i <= size){
                int max = i;
                int left = 2 * i + 1,right = 2 * i + 2;
                if (left <= size && heap[left] > heap[i])max = left;
                if (right <= size && heap[right] > heap[max]) max = right;
                if (max == i)break;
                swap(heap,i,max);
                i = max;
            }
        }
        void sort(int[] array,int k){
            int n = array.length;
            for (int i = n/2 - 1; i >= 0 ; i--) {
                heap(array,i,n-1);
            }
            int size = n - 1;
            while (k > 1){
                swap(array,0,size);
                size--;
                heap(array,0,size);
                k--;
            }
        }
        public int findKthLargest(int[] nums, int k) {
            sort(nums, k);
            return nums[0];
        }
    // using priorityQueue
//    static int KthLargestElement(int[] arr,int k){
//            PriorityQueue<Integer> minpq = new PriorityQueue<>();
//            for(int i = 0 ; i < k;i++){
//                minpq.add(arr[i]);
//            }
//            for(int i = k;i < arr.length;i++){
//                if(minpq.peek() < arr[i]){
//                    minpq.poll();
//                    minpq.add(arr[i]);
//                }
//            }
//            return minpq.peek();
//    }

    // simple and easy code

    static int KthLargestElement(int[] arr,int k){
        PriorityQueue<Integer> minpq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            minpq.add(arr[i]);
            if(minpq.size() > k){
                minpq.poll();
            }
        }
        return minpq.peek();
    }

    public static void main(String[] args) {
        int[] array = {10,3,7,4,8,9,2,6};
        System.out.println(KthLargestElement(array,5));
    }

}
