import java.util.*;

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hay = sc.nextLine();
        String needle = sc.nextLine();

        System.out.println(hay.indexOf(needle));
    }
}
