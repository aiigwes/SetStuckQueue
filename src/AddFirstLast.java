import java.util.ArrayDeque;

public class AddFirstLast {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.addFirst(1);
        d.addLast(2);
        d.addFirst(0);

        System.out.println(d);
    }
}
