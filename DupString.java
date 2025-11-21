import java.util.*;

public class DupString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == c) st.pop();
            else st.push(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : st) sb.append(c);
        System.out.println(sb.toString());
    }
}
