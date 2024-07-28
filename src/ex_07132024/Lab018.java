package ex_07132024;

public class Lab018 {
    public static void main(String[] args) {
        //Cuncatination
        int a= 10;
        int b = 20;
        System.out.println(a+b);

        String s1= "Harshit";
        String s2 = "Singh";
        System.out.println(s1 +s2);

        String s3= "Aditya";
        int x = 99;
        int y = 100;
        System.out.println(x+y);
        System.out.println(x+s3); //appending is happening here
        System.out.println(s3+y);
        System.out.println(x+y+s3);
        System.out.println(s3+x+y);
        System.out.println(x+s3+y);
        System.out.println(x+y+s3+y+s3+x+y);
    }
}
