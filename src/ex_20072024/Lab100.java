package ex_20072024;

import java.util.Scanner;

public class Lab100 {
    public static void main(String[] args) {
        // write a program to ask - name, age, salary- print it
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.next();

        System.out.println("Enter your age ");
        int age = sc.nextInt();

        System.out.println("Enter your salary");
        double salary = sc.nextDouble();

        System.out.println("your details are-" + name);
        System.out.println("your age is-" + age);
        System.out.println("your salary is-"+ salary);

        sc.close();

    }
}
