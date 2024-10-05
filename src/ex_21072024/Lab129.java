package ex_21072024;

import java.util.Scanner;

public class Lab129 {
    public static void main(String[] args) {
        // coding program
        // Factorial program
        // n =5 -> fact = 5*4*3*2*1
        // n= 1-> Fact = 1*1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no and you will get the factorial-");
        int n = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <=n; i++) {
            fact = fact*i;
        }
        System.out.println(fact);
        sc.close();

    }
}
