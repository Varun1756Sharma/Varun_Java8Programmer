import java.util.*;

public class AddHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            String s = sc.nextLine();
            set.add(s);
        }

        System.out.println("HashSet: " + set);
    }
}
