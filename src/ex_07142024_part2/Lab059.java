package ex_07142024_part2;

public class Lab059 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        // part -> A -> ++a, Exp= 11, a=11
        // part -> B -> a++, Exp= 11, a=12
        // part -> C -> a++, Exp= 12, a=13
        // op-> exp1 + exp +exp3
        //a = 13
    }
}
