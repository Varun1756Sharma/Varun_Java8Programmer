import java.util.*;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] freq = new int[128];
        for (char c : s.toCharArray()) freq[c]++;

        int len = 0;
        boolean oddFound = false;

        for (int f : freq) {
            len += (f / 2) * 2;
            if (f % 2 == 1) oddFound = true;
        }
        if (oddFound) len++;

        System.out.println(len);
    }
}