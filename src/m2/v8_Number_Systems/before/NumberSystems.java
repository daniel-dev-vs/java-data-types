package m2.v8_Number_Systems.before;
import static java.lang.System.out;

public class NumberSystems {
    public static void main(String[] args) {
        out.println("\n** Alternative Number Systems ** \n");

        int a =0b10001;
        out.println(Integer.toBinaryString(a));
        out.println(Integer.toBinaryString(a >>2));
        out.println(Integer.toBinaryString(a <<2));
        out.println(Integer.toBinaryString(1111));
        out.println(Integer.toBinaryString(a>>>2));
    }
}
