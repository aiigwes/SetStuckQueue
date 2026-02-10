import java.util.Arrays;
import java.util.HashSet;

public class ContainsAll {
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> setB = new HashSet<>(Arrays.asList(1, 2));

        if (setA.containsAll(setB))
            System.out.println("setA contains all the elements setB");
        else
            System.out.println("setA doesn't contain all the elements setB");
    }
}
