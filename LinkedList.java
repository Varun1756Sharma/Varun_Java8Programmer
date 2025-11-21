import java.util.*;

public class LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter how many elements you want to add: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        System.out.println("LinkedList elements are:");
        for(int x : list){
            System.out.print(x + " ");
        }
    }
}
