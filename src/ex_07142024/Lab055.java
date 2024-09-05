package ex_07142024;

public class Lab055 {
    public static void main(String[] args) {
        int a = 10;
//        System.out.println(a++);// ++ is faded by
        System.out.println(a++ + a);
        //A = a++ ->10 after this a= 11
        // +
        // B = a ->11 -> A+B = 10+11
    }
}
