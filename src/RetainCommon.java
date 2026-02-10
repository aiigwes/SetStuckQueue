import java.util.Arrays;
import java.util.HashSet;

public class RetainCommon {
    public static void main(String[] args) {
        HashSet<Integer> X = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> Y = new HashSet<>(Arrays.asList(2, 3, 4));

        X.retainAll(Y);
        System.out.println(X);
    }
}
