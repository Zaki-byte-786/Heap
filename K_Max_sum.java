import java.util.*;
public class K_Max_sum {
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        // code here
        Arrays.sort(A);
        Arrays.sort(B);
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            return Integer.compare(b[0],a[0]);
        });
        HashSet<String> set = new HashSet<>();
        pq.add(new int[]{A[N-1]+B[N-1],N-1,N-1});
        set.add((N-1)+"-"+(N-1));
        for(int count = 0;count < K && !pq.isEmpty();count++){
            int[] top = pq.poll();
            ans.add(top[0]);
            int i = top[1];
            int j = top[2];
            if (i-1 >= 0 && !set.contains((i-1)+"-"+j)){
                pq.add(new int[]{A[i-1]+B[j],i-1,j});
                set.add((i-1)+"-"+j);
            }
            if(j-1 >= 0 && !set.contains(i+"-"+(j-1))){
                pq.add(new int[]{A[i]+B[j-1],i,j-1});
                set.add(i+"-"+(j-1));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};
        System.out.println(Arrays.toString(array));
        String s = 1 + "a" + 2;
        System.out.println(s);
    }
}
