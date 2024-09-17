package ex_20072024;

public class Lab099 {
    public static void main(String[] args) {
       //new feature of switch
        // yield means return in future
       char code = 'A';
       int val= switch (code){
           case 'A':
               yield 65;
           case 'B':
               yield 66;
           default:
               throw new IllegalStateException("Unexpected value: " + code);
       };
        System.out.println(val);
    }
}
