package ex_07142024_part2;

public class Lab072 {
    public static void main(String[] args) {
        String password = "Harshit@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
        //pass_u == password

        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));
        // Harshit@123 = harshit@123 = HArshit@123= HaRshit@123

        System.out.println(password.substring(0,4));
        System.out.println(password.indexOf('r'));
        System.out.println(password.length());


    }
}
