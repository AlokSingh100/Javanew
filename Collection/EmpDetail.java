package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpDetail {
    public static void main(String[] args) {
        List<Employee> emp=new ArrayList<Employee>();
        Scanner scanner=new Scanner(System.in);
        int select = 0;
        int idt,sid;
        String name;
        Float salary;
        while (true){
            System.out.println("Select Any one Option");
            System.out.println("1: Insert");
            System.out.println("2: Display");
            System.out.println("3: Search");
            System.out.println("4: Update");
            select=scanner.nextInt();
            switch (select){
                case 1:
                    System.out.println("Enter the Employee Id");
                    idt=scanner.nextInt();
                    System.out.println("Enter Employee Name");
                    name=scanner.next();
                    System.out.println("Enter the Employee Salary");
                    salary=scanner.nextFloat();
                    emp.add(new Employee(idt,name,salary));
                    break;
                case 2:
                    System.out.println("Employee ID  | Employee Name  | Employee Salary ");
                    for(Employee t:emp){
                        System.out.println(t);
                        break;
                    }
                case 3:
//                    System.out.println("Enter the Employee id ");
//                    sid=scanner.nextInt();
//                    if (sid=idt){
//


            }



        }


    }
}
