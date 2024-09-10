package ex_20072024;

import java.util.Scanner;

public class Lab089 {
    public static void main(String[] args) {
        // GRADE calculator
        // write a program that calculates and display
        // the letter grade for a given numerical
        // score(e.g.,A, B, C, D, E or F)
        //based on the following grade scale:
        // A:90-100
        // B: 80- 89
        // C: 70-79
        // D: 60-69
        // F: 0-59


        // find the user input
        // score - data type?- int
        // return a grade - char data type - char- A
        // for user input use - Scanner class
        // rough logic
        // if(score

        // write the code

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Score!!");
        int score = sc.nextInt();

        char grade = 'F';

        if (score > 90 && score <= 100) {
            grade = 'A';
        } else if (score > 80 && score <= 89) {
            grade = 'B';
        } else if (score > 70 && score <= 79) {
            grade = 'C';
        } else if (score > 60 && score <= 69) {
            grade = 'D';
        }
        else if(score <= 0 || score > 100) {
            System.out.println("LOL are you God?");
        }else{
            grade = 'F';
        }
        System.out.println("Your Grade is -> "+ grade);

        sc.close();
    }
//        System.out.println(grade);







}
