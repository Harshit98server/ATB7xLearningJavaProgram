package ex_07142024_part2;

public class Lab070 {
    public static void main(String[] args) {
        String s1 = new String("Harshit");
        //new always create a new memory space
        String s2 = new String("Harshit");
        String s3 = new String("Harshit");

        System.out.println(s1== s2);
        System.out.println(s2== s3);
        System.out.println(s2.equals(s3));// content is equal

    }
}
