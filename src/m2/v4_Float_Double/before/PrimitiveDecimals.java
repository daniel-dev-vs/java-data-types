package m2.v4_Float_Double.before;
import java.math.BigInteger;

import static java.lang.System.out;

public class PrimitiveDecimals {

    public static void main(String[] args) {
        out.println("\n** Primitive Decimals ** \n");

        float bigfloat = 9999999999999999999999999999f;
        long bigInt = 99999999999999999L;
        BigInteger bint = BigInteger.valueOf( bigInt+8888888888L);
        out.println(bigInt);

        out.println(bigfloat);
        out.println(bint);

    }
}
