import java.util.*;

public class ConvertHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.print("Enter string: ");
            set.add(sc.nextLine());
        }

        // Convert to array
        String[] arr = set.toArray(new String[0]);

        // Convert to List
        List<String> list = new ArrayList<>(set);

        System.out.println("HashSet: " + set);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("List: " + list);
    }
}
