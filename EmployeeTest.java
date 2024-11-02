
package employeetest;

import java.util.Scanner;
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("---For the first employee---");
        System.out.print("\nWrite firstname: ");
        String fn1 = input.next();
        System.out.print("\nWrite lastname: ");
        String ln1 = input.next();
        System.out.print("\nWrite monthly salary: ");
        double ms1 = input.nextDouble();
        System.out.println("\n---For the second employee---");
        System.out.print("\nWrite firstname: ");
        String fn2 = input.next();
        System.out.print("\nWrite lastname: ");
        String ln2 = input.next();
        System.out.print("\nWrite monthly salary: ");
        double ms2 = input.nextDouble();
        
        Employee emp1 = new Employee(fn1, ln1, ms1); // the objects
        Employee emp2 = new Employee(fn2, ln2, ms2);

         
        System.out.println("\n  NAME\t\t\tYEARLY SALARY");
        System.out.println("*********\t\t******************");
        emp1.display1();
        emp2.display1();
        
        System.out.println("\nyoohooo! a 10 percent raise!");
        emp1.raise();
        emp2.raise();
        
        System.out.println("\n  NAME\t\t\tYEARLY SALARY");
        System.out.println("*********\t\t******************");
        emp1.displayfinal();
        emp2.displayfinal();
        
        
    }
    
}
