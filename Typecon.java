import java.sql.SQLOutput;
import java.util.Scanner;
public class Typecon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte b = 45;
        int i = 4500;
        float f = 463.25f;
        char c = 'a';
        short s = 5145;
        double d = 0.12345;
        double result = (f*b)+(i/c)-(d-s);
        System.out.println((f*b) + "" + (i/c)+ "" + (d-s));
        System.out.println(result);


    }
}
