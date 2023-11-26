package m3.v3_AssignmentOperators.before;
import static java.lang.System.out;

public class AssignmentOperators {
    public static void main(String[] args) {
        out.println("\n** Assignment Operators ** \n");
        boolean flag = false;
        int z = 0;

        if (flag = true){
            z =5;
        } else {
            z=3;
        }

        out.println(z);

        int x = 1;
        int y = 2;

        int s = x*y;

        out.println(((Object)y).getClass().getName());
    }
}
