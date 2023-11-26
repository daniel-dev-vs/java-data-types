package m2.v2_Boolean.before;
import static java.lang.System.out;

public class PrimitiveBooleans {
    public static void main(String[] args) {
        out.println("\n** Primitive booleans ** \n");
        boolean flag = true;
        flag = false;


        //you cannot convert primitive boolean to or for any value.

        int integer = flag ? 1 : 0;
        out.println(flag);
        out.println(integer);
    }
}
