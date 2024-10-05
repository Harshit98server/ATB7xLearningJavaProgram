package ex_07202024;

import java.util.Scanner;

public class Lab086 {
    public static void main(String[] args) {
        // Take a user input and check if its even or odd.
        //Logic Building
        //1- Figure out the input
        //


        //2- which data type to use
        //3- Do we need conversion or directly
        //4- Rough logic
        //5- optimize
        //int - size - 32 bit-2,147,483,647

        Scanner sc = new Scanner(System.in);//object of the scaner class- OOPs
        System.out.println("Enter the Num 1:");
        int user_input_1 = sc.nextInt();
        System.out.println(user_input_1);

        System.out.println("Enter the Num 2:");
        int user_input_2 = sc.nextInt();

        System.out.println(user_input_2);
        if(user_input_2 %2 ==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        System.out.println(user_input_1);
        if(user_input_2 %2 ==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

    }
}
