
import java.lang.System;
import java.util.Scanner;

public class ifelse {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
       System.out.print("enter the status");
        String Megana = scan.nextLine();


        if(Megana.equals("dead"))
        {
            System.out.print("suriya meets savi");
        }
        else{
            System.out.print("suriya weds megana");
    }



    }
}