import java.util.Arrays;
import java.util.HashSet;

public class BulkAdd {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6));

        set1.addAll(set2);
        System.out.println(set1);
    }
}
