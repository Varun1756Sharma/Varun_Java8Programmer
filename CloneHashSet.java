import java.util.*;

public class CloneHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            set.add(sc.nextInt());
        }

        HashSet<Integer> cloned = (HashSet<Integer>) set.clone();

        System.out.println("Original HashSet: " + set);
        System.out.println("Cloned HashSet: " + cloned);
    }
}
