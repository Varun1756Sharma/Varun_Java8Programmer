import java.io.*;
import java.util.Scanner;

public class Main {
    static void reversedArray(int[] arr){
        int start = 0;
         int end = arr.length - 1;
         while(start<end){
             int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
         }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reversedArray(arr);
        for(int num:arr){
            System.out.println(num+" ");
        }
    }

}
