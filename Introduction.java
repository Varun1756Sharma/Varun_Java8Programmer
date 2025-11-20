import java.util.*;

public class Introduction {
    public static void main(String[] args) {  //Command line arguement
        Scanner v = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = v.nextLine();
        System.out.print("Enter your age:");
        int age = v.nextInt();
        System.out.print("Enter your cgpa:");
        float CGPA = v.nextFloat();
        System.out.print("Enter your grade:");
        String grade = v.next();

        //to take inputs more than one word
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("CGPA:" + CGPA);
        System.out.println("Grade:" + grade);

    }
}