package ex_20072024;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Lab102 {
    public static void main(String[] args) {
        //Program to check if the no is positive or negative

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        if(num >0){
            System.out.println("Positive Number");
        } else if (num < 0) {
            System.out.println("Negative Number");
        }else {
            System.out.println("Zero");
        }
    }
}
