import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   static void swap(int[] array,int a,int b){
        array[a] = array[a] + array[b];
       array[b] = array[a] - array[b];
       array[a] = array[a] - array[b];
    }
    static void swap(int a,int b){
       a = a + b;
       b = a - b;
       a = a - b;
    }
   static void swap(int[] array){
       array[0] = array[0] + array[1];
       array[1] = array[0] - array[1];
       array[0] = array[0] - array[1];
    }
    public static void main(String[] args) {
int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = i;
        }
        int capacity = 4;
        System.out.println(Arrays.toString(array));
//        array = Arrays.copyOf(array,2 * capacity);
//        System.out.println(Arrays.toString(array));
//        System.out.println(capacity);
//        array[0] = array[0] + array[3];
//        array[3] = array[0] - array[3];
//        array[0] = array[0] - array[3];
//        swap(array,0,3);
//        System.out.println(Arrays.toString(array));
//        int a = 1;
//        int b = 2;
//        swap(a,b);
//        System.out.println(a + " " + b);
        int[] values = {1,3};
        swap(values);
        System.out.println(values[0] + " " + values[1]);

    }
}