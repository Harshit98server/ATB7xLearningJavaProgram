package ex_07142024;

public class Lab052 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45F;
        float total_price = course +GST;//not allowed
        //because we are Implicit narrowing
        //we can convert the gst into integer
        //but we are loosing .45 rupees
        // that is why we use Explicit narrowing-real time ex
        System.out.println(total_price);
    }
}
