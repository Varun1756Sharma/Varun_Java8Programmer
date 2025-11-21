import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int x : arr) {
            if(set.contains(x)) {
                System.out.println("Duplicate found");
                return;
            }
            set.add(x);
        }

        System.out.println("No duplicates");
    }
}
