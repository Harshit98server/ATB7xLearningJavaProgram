package ex_20072024;

import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter -");
        // how to take char input
        //char user_input = sc.next().charAt(0);
        char user_input2 = sc.next().charAt(0);
        //System.out.println(user_input);
        // aeiou
//        switch (user_input){
//            case 'a' -> System.out.println("Vowel a");
//            case 'e' -> System.out.println("Vowel e");
//            case 'i' -> System.out.println("Vowel i");
//            case 'o' -> System.out.println("Vowel o");
//            case 'u' -> System.out.println("Vowel u");
//            default -> System.out.println("Not a vowel, its consonant");
//        }

        switch (user_input2) {
            case 'a','e','i','o','u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("Not a vowel, its consonant");
        }

    }
}
