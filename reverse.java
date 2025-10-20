package newjava;

public class reverse {
    public static void main(String[] args) {
        int num = 1234567;
        int count = 0;

        while(num>0){
            int ans = num % 10;
            num /= 10;
            count = count * 10 + num;

        }

        System.out.println(count);

    }
}
