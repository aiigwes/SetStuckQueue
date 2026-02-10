import java.util.ArrayDeque;

public class StackBehavior {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
