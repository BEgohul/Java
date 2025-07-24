import java.lang.System;
import java.util.Scanner;


public class userinput {

    public static void main(String args[])
    {
        Scanner go = new Scanner(System.in);
        System.out.print("Enter the values: ");
        int a = go.nextInt();
        int b = go.nextInt();
        int c = a+b;
        System.out.println(c);


    }
}
