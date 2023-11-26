package m3.v1_Arithmetic_Operators.before;
import static java.lang.System.out;

public class ArithmeticOperators {
    public static void main(String[] args) {
        out.println("\n** Arithmetic Operators ** \n");

        int n = 5;
        long x = 290L;

        //int y = n*x;
        int y = (int)(n*x);

        n += n*x;

        byte b = 5;
        long l = 100L;

        b += b+l;

        out.println(b);

    }
}
