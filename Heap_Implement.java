import java.util.Arrays;

public class Heap_Implement {
    static void swap(int[] heap,int i,int max){
        heap[i] = heap[i] + heap[max];
        heap[max] = heap[i] - heap[max];
        heap[i] = heap[i] - heap[max];
    }

//    TC->O(N)

    static void heap1(int[] heap,int i){
        int size = heap.length;
        while (i < size){
            int max = i;
            int left = 2 * i + 1,right = 2 * i + 2;
            if (left < size && heap[left] > heap[i])max = left;
            if (right < size && heap[right] > heap[max]) max = right;
            if (max == i)break;
            swap(heap,i,max);
            i = max;
        }
    }


//    TC->O(NlogN)

    static void heap2(int[] heap){
        for (int i = 1; i < heap.length ; i++) {
            while (i > 0 && heap[(i-1)/2] < heap[i]){
                swap(heap,(i-1)/2,i);
                i = (i-1)/2;
            }
        }
    }


    public static void main(String[] args) {
        int[] array = {4,2,0,7,8,6,9,2,11};
        int n = array.length;
        for (int i = n/2 - 1; i >= 0 ; i--) {
            heap1(array,i);
        }
        System.out.println(Arrays.toString(array));




        heap2(array);
        System.out.println(Arrays.toString(array));
    }
}
