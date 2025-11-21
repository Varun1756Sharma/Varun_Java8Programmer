import java.util.*;

public class HashSetIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        System.out.print("Enter size of Set 1: ");
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) set1.add(sc.nextInt());

        System.out.print("Enter size of Set 2: ");
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) set2.add(sc.nextInt());

        set1.retainAll(set2);

        System.out.println("Common elements: " + set1);
    }
}
