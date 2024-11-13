import java.util.*;
public class median_of_stream_data {

//    chatgpt code
    static PriorityQueue<Integer> low = new PriorityQueue<>(Collections.reverseOrder()); // max-heap
   static PriorityQueue<Integer> high = new PriorityQueue<>(); // min-heap
    // Max-heap to store the lower half of the numbers
    // Min-heap to store the upper half of the numbers
    static void addNum(int num) {
        if (low.isEmpty() || num <= low.peek()) {
            low.add(num);
        } else {
            high.add(num);
        }

        // Step 2: Balance the heaps
        if (low.size() > high.size() + 1) {
            high.add(low.poll());
        } else if (high.size() > low.size()) {
            low.add(high.poll());
        }
    }

    static double findMedian() {
        if (low.size() > high.size()) {
            return low.peek();
        } else {
            return (low.peek() + high.peek()) / 2.0;
        }
    }

//    mycode


//PriorityQueue<Integer> maxpq = new PriorityQueue<>((a,b)->{
//    return Integer.compare(b,a);
//});
//    PriorityQueue<Integer> minpq = new PriorityQueue<>();
//    public void addNum(int num) {
//        if(maxpq.size() == 0 || num <= maxpq.peek()){
//            maxpq.add(num);
//        }
//        else{
//            minpq.add(num);
//        }
//        if(maxpq.size() > minpq.size() + 1){
//            minpq.add(maxpq.poll());
//        }
//        else if(maxpq.size() < minpq.size()){
//            maxpq.add(minpq.poll());
//        }
//    }
//
//    public double findMedian() {
//        if(maxpq.size() > minpq.size()){
//            return maxpq.peek();
//        }
//        return maxpq.peek()+(minpq.peek() - maxpq.peek()) / 2.0;
//    }

    public static void main(String[] args) {
int[] array = {1,4,5,6,7,3,2};
        for (int i = 0; i < array.length; i++) {
            addNum(array[i]);
            System.out.println(findMedian());
        }
    }
}
