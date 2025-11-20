import java.util.*;
public class Lostdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int total = n * (n + 1)/ 2;
        int actual = 0;
        for (int i = 0; i < n; i++) {
            actual = actual + arr[i];
        }
        int lost = total - actual;
        System.out.println("The lost digit is:" + lost);
        {
            System.out.println();
        }

    }
}