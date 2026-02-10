import java.util.ArrayDeque;

public class PollVariants {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(5);
        d.add(8);
        d.add(2);
        d.add(7);

        System.out.println(d.poll());
        System.out.println(d.pollFirst());
        System.out.println(d.pollLast());
    }
}
