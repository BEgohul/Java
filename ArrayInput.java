package newjava;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayInput {
    public static void main(String[] args) { //main fuctions executes first
        Scanner in = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));


    }
}

