import java.util.Arrays;
import java.util.Scanner;


public class Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(in.next());  //iteration
        }
            System.out.println(Arrays.toString(arr));

            change(arr);
            System.out.println(Arrays.toString(arr));
        }
        static void change ( int[] arr){
            arr[0] = 99;
        }
    }


