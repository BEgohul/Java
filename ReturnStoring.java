package newjava;

public class ReturnStoring {
    static int mymethod(int a , int b){
        return a-b;
    }

    public static void main(String[] args) {  //main function executes first 
        int z = mymethod(908324, 9871298);
        System.out.println(z);
    }
}

