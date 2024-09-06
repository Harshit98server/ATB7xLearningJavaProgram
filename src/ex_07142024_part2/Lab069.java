package ex_07142024_part2;

public class Lab069 {
    public static void main(String[] args) {
        String name = "The testing academy";//SCP
        String name1 = "The testing academy";//SCP

        String name2 = new String("The testing academy");//heap area
        //String name3 = new String("The testing academy");//heap area
        // there are 4 strings
//                System.out.println(name == name1);// check for the refrence
//                System.out.println(name.equals(name1);// check for the refrence
        System.out.println(name1 == name2);// this checks the location also
        System.out.println(name1.equals(name2));// this checks the content only
    }
}
