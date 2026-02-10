import java.util.Arrays;
import java.util.HashSet;

public class CheckMembership {
    static boolean isAllowed(HashSet<String> set, String name) {
            return set.contains(name);
    }

    public static void main(String[] args) {
        HashSet<String> users = new HashSet<>(Arrays.asList("Aigerim", "Diana", "Ulana"));

        System.out.println(isAllowed(users, "Aigerim"));
        System.out.println(isAllowed(users, "Amir"));
    }
}
