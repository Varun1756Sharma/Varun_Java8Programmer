import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.toLowerCase().split("\\W+");
        HashSet<String> unique = new HashSet<>(Arrays.asList(words));
        for(String w:unique){
            System.out.println(w+" ");
        }
    }
}