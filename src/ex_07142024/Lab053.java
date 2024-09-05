package ex_07142024;

public class Lab053 {
    public static void main(String[] args) {
        // Increment (++)and decrement(--) operator
        //pre and post


        // pre - Increment
        // value is incremented and then stored in the result
//        int a = 10;
//        int b = ++a; // a= a+1;
//        // Exp b = 11, a= 11
//        System.out.println(a);
//        System.out.println(b);

        int a = 10;
//        System.out.println(++a);
        // Exp = 11, a = 11;
//        System.out.println(a);

        //POST
        // value is stored in the result and incremented later
        int a_post = 10;
        System.out.println(a_post++);
        //Exp =10, a = 11
        System.out.println(a_post);



    }
}
