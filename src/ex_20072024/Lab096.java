package ex_20072024;

public class Lab096 {
    public static void main(String[] args) {
        //JCK > 13
        int itemcode = 007;
        switch (itemcode){
            case 001, 002, 003:
                System.out.println("It is a electronic gadget");
                break;
            case 004,005,006:
                System.out.println("it is mechanical gadget");
                break;
            default:
                System.out.println("None");
        }
    }
}
