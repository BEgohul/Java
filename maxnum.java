import java.util.Scanner;
public class  maxnum{
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();

      // to find max number
        int max = a;
        if(b>max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println(max);            //Math.max is also used to find the largest number
                                                  // int max = Math.max(c, Math.max(a,b));
    }
}

