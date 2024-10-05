package ex_21072024;

import java.util.Scanner;

public class Lab132 {
    public static void main(String[] args) {
        // FizzBuzz Problem Hacker rank question
        // write a program that prints number form 1 to 100
        // for multiples of 3 , print fizz instead of the number,
        // and for multiple of 5 prints Buzz
        // for multiple of 3 and 5 prints- "FizzBuzz"
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Max number-");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            if (i%3 ==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if (i%3 ==0){
                System.out.println("Fizz");
            }
            else if (i%5==0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }


        }
    }
}
