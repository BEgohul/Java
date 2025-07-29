import java.util.Scanner;
package newjava;

public class TWOarray {
    public static void main(String[] args) {
        int[][] arr= new int[3][3];
//        int[][] arr = {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };
        Scanner in = new Scanner(System.in);
        System.out.println(arr.length ); //no. of rows
        //input
        for(int row = 0 ; row < arr.length ; row++){

            for(int col = 0 ; col < arr[row]) ; col++){
            arr[row][col] = in.nextInt();

        }

    }
}
}