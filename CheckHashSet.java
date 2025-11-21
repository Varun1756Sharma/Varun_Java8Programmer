import java.util.*;

public class CheckHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        System.out.print("Enter number of values: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            set.add(sc.nextInt());
        }

        System.out.print("Enter value to search: ");
        int key = sc.nextInt();

        if (set.contains(key))
            System.out.println(key + " exists in the set.");
        else
            System.out.println(key + " does not exist.");
    }
}
