import java.util.Arrays;
import java.util.HashSet;

public class BulkRemove {
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5));

        setA.removeAll(setB);
        System.out.println(setA);
    }
}
