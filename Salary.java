import java.util.Scanner;

class Employee{
    private String name;
    private double salary;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double salary(double percent){
        double p = ((this.salary)*(percent))/(100);
        return this.salary + p;

    }
}
 public class Salary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee obj = new Employee();
        obj.setName(sc.nextLine());
        obj.setSalary(sc.nextDouble());
        double percent = sc.nextDouble();
        obj.salary(percent);
        System.out.println("Name: " +  obj.getName());
        System.out.println("Salary: " +  obj.getSalary());
        System.out.println("Increased Salary: " + obj.salary(percent));
    }
 }
