import java.util.Arrays;

class Heap{
    int size;
    int[] heap;
    int capacity;
    Heap(){
        size = 0;
        capacity = 10;
        heap = new int[capacity];
    }
    void capacityIncrease(){
       heap = Arrays.copyOf(heap,2 * capacity);
       capacity = 2 * capacity;
    }
    void swap(int a,int b){
        heap[a] = heap[a] + heap[b];
        heap[b] = heap[a] - heap[b];
        heap[a] = heap[a] - heap[b];
    }
    void add(int data){
        if (size + 1 == capacity)capacityIncrease();
        size++;
        int i = size;
        heap[i] = data;
        while (i > 1 && heap[i] > heap[i / 2]){
            swap(i,i/2);
            i = i / 2;
        }
    }
    void remove(){
        if (size == 0){
            System.out.println("heap is empty");
        }
        int i = 1;
        swap(i,size);
        size--;
        while (i<= size){
            int max = i;
            int left = 2 * i;
            int right = 2 * i + 1;
            if (left <= size && heap[i] < heap[left]){
                max = left;
            }
            if (right <= size && heap[max] < heap[right]){
                max = right;
            }
            if (i == max)break;
            swap(i,max);
            i = max;
        }
    }
    void printHeap(){
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }

}
public class Max_Heap {

    public static void main(String[] args) {
        Heap heap = new Heap();
        for (int i = 1; i <= 10 ; i++) {
            heap.add(i);
        }
        heap.printHeap();
        heap.add(12);
        heap.printHeap();
        heap.add(20);
        heap.printHeap();
        System.out.println(heap.size);
        heap.remove();
        heap.printHeap();
    }
}
