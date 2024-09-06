package ex_07142024_part2;

public class Lab071 {
    public static void main(String[] args) {
        String s1 = "Harshit";
        //         /0/1/2/3/4/5/6/
        char c = s1.charAt(5);
        System.out.println(c);

        // Non-Primitive Types - String, Array, Class, ENUM.. more will come
        s1.concat("Singh");
        System.out.println(s1);
        // the value remains the same because
        // we are not saving the value any where
        // so the output is still Harshit
    }
}
