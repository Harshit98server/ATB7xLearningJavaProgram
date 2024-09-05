package ex_07142024;

public class Lab056 {
    public static void main(String[] args) {
        int a = 10;
//      System.out.println(a++);// ++ is faded by
        System.out.println(++a + ++a);
        System.out.println(a);
        //A = a++ ->Exp= 11, a =11 after this a= 11
        // + - operator
        // B = ++a-> Exp= 12/ a= 12
        // -> A+B = 11+12
    }
}
