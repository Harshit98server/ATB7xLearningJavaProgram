package ex_21072024;

public class Lab135 {
    public static void main(String[] args) {
        //Function
        // Block of code which we can reuse
        // Pre built Math.max();
        // user defined / created
        // Two components of function
        //1. Define

        // 2. call the function
        // 1-functions without Parameters and without return
        // 2-without Parameters but with return
        // 3-with Parameters and without Return type
        // 4-with Parameters and with Return type
        function_type1();
        System.out.println("-----------------");
        String name = function_type2();
        System.out.println(name);
        System.out.println("-----------------");

        function_type3("Singh");
        System.out.println("-----------------");

        int sum_result = function_type4(9,6);
        System.out.println(sum_result);

    }
    static void function_type1(){
        System.out.println("1-without Parameters and without return");
    }
    static String function_type2(){
        System.out.println("2-without Parameters but with return");
        return "Harshit";
    }
    static void function_type3(String name){
        System.out.println("3-with Parameters and without Return type");
        System.out.println("you have shared -> "+ name);
    }
    // with parameters and with return type
    static int function_type4(int a, int b){
        System.out.println("4-with Parameters and with Return type");
        return a+b;
    }

}
