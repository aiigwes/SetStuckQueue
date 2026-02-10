import java.util.Arrays;
import java.util.HashSet;

public class RemoveElements {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>(Arrays.asList("Aigerim", "Diana", "Ulana", "Amir", "Erzhan"));

        boolean removed = names.remove("Amir");
        System.out.println(removed);
        System.out.println(names);
    }
}
