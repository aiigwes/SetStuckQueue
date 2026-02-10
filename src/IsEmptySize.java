import java.util.ArrayDeque;

public class IsEmptySize {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        System.out.println(d.size() + " " + d.isEmpty());

        d.add(67);
        System.out.println(d.size() + " " + d.isEmpty());

        d.poll();
        System.out.println(d.size() + " " + d.isEmpty());
    }
}
