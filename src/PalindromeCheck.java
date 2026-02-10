import java.util.ArrayDeque;

public class PalindromeCheck {
    static boolean isPalindrome(String s) {
        ArrayDeque<Character> d = new ArrayDeque<>();
        for (char c : s.toCharArray())
            d.add(c);

        while (d.size() > 1) {
            if (!d.pollFirst().equals(d.pollLast()))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("hello"));
    }
}
