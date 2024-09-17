package ex_20072024;

public class Lab097 {
    public static void main(String[] args) {
        // alternative of break
        int itemcode = 001;

        switch (itemcode) {
            case 001 -> System.out.println("its laptop");
            case 002 -> System.out.println("its desktop");
            case 003 -> System.out.println("its mobile");
            default -> System.out.println("Heloo!");
        }
    }
}
