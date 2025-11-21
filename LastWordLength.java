import java.util.*;

public class LastWordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        int i = s.length() - 1;
        int cnt = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            cnt++;
            i--;
        }
        System.out.println(cnt);
    }
}