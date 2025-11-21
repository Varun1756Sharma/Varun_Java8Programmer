import java.util.*;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array values:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSoFar = arr[0];
        int current = arr[0];

        for(int i = 1; i < n; i++) {
            current = Math.max(arr[i], current + arr[i]);
            maxSoFar = Math.max(maxSoFar, current);
        }

        System.out.println("Maximum subarray sum: " + maxSoFar);
    }
}
