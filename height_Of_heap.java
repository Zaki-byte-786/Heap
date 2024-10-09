public class height_Of_heap {
    static int heapHeight(int N, int arr[]){
        // code here
        if(N == 1)return 1;
        int count = 0,r = N;
        while(r > 1){
            r = r / 2;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
