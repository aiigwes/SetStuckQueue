import java.util.ArrayDeque;

public class OfferFirstLast {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        System.out.println(d.offerFirst(1));
        System.out.println(d.offerLast(2));
        System.out.println(d);
    }
}
