import java.util.ArrayDeque;

public class PeekVariants {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.add(2);

        System.out.println(d.peek());
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());

        d.clear();
        System.out.println(d.peek());
    }
}
