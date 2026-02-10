import java.util.ArrayDeque;

public class ClearDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(6);
        d.add(7);

        d.clear();
        System.out.println(d.peek());
        System.out.println(d.isEmpty());
    }
}
