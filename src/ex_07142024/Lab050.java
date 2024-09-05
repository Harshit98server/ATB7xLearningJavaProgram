package ex_07142024;

public class Lab050 {
    public static void main(String[] args) {
        long Phone_no = 9876543210l;
        //short s = Phone_no; //Implicit Narrowing- JVM?
        short s = (short) Phone_no;
        System.out.println(s);
        // JVM- GC - garbage collector
    }
}
