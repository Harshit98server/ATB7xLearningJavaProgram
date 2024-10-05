package ex_21072024;

public class Lab123 {
    public static void main(String[] args) {
        for (int i = 0; i <=50; i++) {//i = 0 to 9 , runs 10 times
            System.out.println(i);
            if (i%2==0){
                System.out.println("Even-> "+ i);
                continue;
//                break;
            }
            System.out.println("odd-> "+i);
        }
    }
}
