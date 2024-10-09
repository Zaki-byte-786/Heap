import java.util.Arrays;

public class sorting_Array_Using_heap_sort {
    static void swap(int[] heap,int i,int max){
        heap[i] = heap[i] + heap[max];
        heap[max] = heap[i] - heap[max];
        heap[i] = heap[i] - heap[max];
    }
    static void heap(int[] heap,int i,int size){
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
    static void sort(int[] array){
        int n = array.length;
        for (int i = n/2 - 1; i >= 0 ; i--) {
            heap(array,i,n-1);
        }
       int size = n - 1;
        while (size > 0){
            swap(array,0,size);
            size--;
            heap(array,0,size);
        }
    }
    public static void main(String[] args) {
int[] array = {1,4,2,3,5,6,8,7,0};
sort(array);
        System.out.println(Arrays.toString(array));
    }
}
