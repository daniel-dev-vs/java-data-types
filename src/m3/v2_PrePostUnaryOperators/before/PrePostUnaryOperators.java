   package m3.v2_PrePostUnaryOperators.before;
import static java.lang.System.out;

   public class PrePostUnaryOperators {
    public static void main(String[] args) {
        out.println("\n** Pre-/Post-Unary Operators ** \n");


        int xInt = 5;
        int result = ++xInt + xInt + ++xInt;

        out.println(result);
        out.println(xInt);
    }
}
