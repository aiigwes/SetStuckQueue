import java.util.HashSet;

public class InsensitiveUniqueWords {
    public static void main(String[] args) {
        String[] words = {"Apple", "apple", "APPLE", "aPpLE"};
        HashSet<String> set = new HashSet<>();

        for (String w : words) {
            set.add(w.toLowerCase());
        }
        System.out.println(set);
    }
}
