import java.util.Scanner;

public class TWOarray {
    public static void main(String[] args) {

//        int[][] arr = {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };
        Scanner in = new Scanner(System.in);
        int[][] arr= new int[3][3];
        System.out.println(arr.length ); //no. of rows
        //input
        for(int row = 0 ; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {     //used in arrays
                arr[row][col] = in.nextInt();
            }

        }
        //output
               for (int row = 0 ; row < arr.length ; row++){
                    for(int col = 0 ; col < arr[row].length ; col++){
                System.out.println(arr[row][col] + "");

        }
            System.out.println();

    }
}

}
