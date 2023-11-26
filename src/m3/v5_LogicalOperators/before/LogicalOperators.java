package m3.v5_LogicalOperators.before;
import static java.lang.System.out;

public class LogicalOperators {
    public static void main(String[] args) {
        out.println("\n** Logical Operators ** \n");
        boolean t = true;
        boolean f = false;

        out.println("& operator");
        out.println(String.format("t e t = %s", t & t));
        out.println(String.format("t e f = %s", t & f));
        out.println(String.format("f e t = %s", f & t));
        out.println(String.format("f e f = %s", f & f));

        out.println("&& operator");

        out.format("t eeeeee t = %s", t && t);
        out.println(String.format("t e f = %s", t && f));
        out.println(String.format("f e t = %s", f && t));
        out.println(String.format("f e f = %s", f && f));
        int xInt = 7;
        boolean yBool= false;
        boolean result = xInt++ <=7 || (yBool =true);
        out.println(xInt);
        out.println(yBool );
        out.println(result);

    }
}
