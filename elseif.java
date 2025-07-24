package newjava;

import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("enter the salary:");
        int salary = input.nextInt();
        if(salary > 25000){
            salary = salary + 3000;
            }else if(salary > 10000 ){
            salary = salary + 2000;
        }else{
            salary = salary + 1000;
        }
        System.out.println(salary);

    }
}
