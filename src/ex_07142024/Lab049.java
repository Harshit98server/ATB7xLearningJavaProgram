package ex_07142024;

public class Lab049 {
    public static void main(String[] args) {
        //byte b = 10;
        //int i = b;// trying to store value of b in i (int)
        // implicit casting - by JVM (i is faded here)

        //int age = +65; // here + is not needed
        // this is called type casting

        // First case
        // Widening - safe conversion
        byte b =10;
        int a = b; // VALID – Implicit Casting
        int a1 = (int)b; // VALID – Explicit Casting no need to use this.

        // Narrowing
        int val = 300;
        //byte b1 = val;// not possible
        // not able to do implicit casting
        byte b1 = (byte)val; // InVALID - Explicit Casting
        System.out.println(b1);
        //Widening - Implicit , Explicit - Lossless
        //Narrowing - Implicit, Explicit(with data types), loss
    }
}
