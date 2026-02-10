import java.util.ArrayDeque;
import java.util.Arrays;

public class RemoveOccurrence {
    public static void main(String[] args) {
        ArrayDeque<String> d = new ArrayDeque<>(
                Arrays.asList("a","b","c","b","a"));

        d.removeFirstOccurrence("b");
        System.out.println(d);

        d.removeLastOccurrence("a");
        System.out.println(d);
    }
}
