import java.util.*;

public class HashSetSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            set.add(sc.nextInt());
        }

        System.out.println("Size of HashSet: " + set.size());
    }
}
