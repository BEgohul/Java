package newjava;

public class MethodOverloading {

    static int method(int a, int b) {
        return a + b;
    }

    static float method(float b, float a) {
        return a + b;
    }

    static String method(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        int z = method(70, 9);
        float d = method(98732.934f, 987398.43f);
        String c = method("black", "ship");

        System.out.println(z);
        System.out.println(d);
        System.out.println(c);
    }
}
