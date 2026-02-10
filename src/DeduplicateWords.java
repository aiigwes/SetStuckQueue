import java.util.Arrays;
import java.util.HashSet;

public class DeduplicateWords {
    public static void main(String[] args) {
        String text = "i really like to sleep";
        String[] words = text.split(" ");

        HashSet<String> set = new HashSet<>(Arrays.asList(words));
        System.out.println(set);
    }
}
