import java.util.*;

public class ClearHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            set.add(sc.nextLine());
        }

        System.out.println("Original HashSet: " + set);
        set.clear();
        System.out.println("HashSet after clear(): " + set);
    }
}
