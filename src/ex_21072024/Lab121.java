package ex_21072024;

public class Lab121 {
    public static void main(String[] args) {
        //Continue
        for (int i = 0; i < 10; i++) {//i = 0 to 9 , runs 10 times
            System.out.println(i);
            if (i==5){
                continue;
            }
            System.out.println("After!!");
        }
    }
}
