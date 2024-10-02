package Collection;




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpDetail {
    public static void main(String[] args) {
        List<Employee> emp=new ArrayList<Employee>();
        Scanner scanner=new Scanner(System.in);
        int select = 0, fet=0;
        int idt=0,sid=0,ia=0,j=0,nit,fir,sip,dat = 0;
        String name,sir ;
        Float salary,tir ;
        while (true){
            System.out.println("Select Any one Option");
            System.out.println("1: Insert");
            System.out.println("2: Display");
            System.out.println("3: Search");
            System.out.println("4: Update");
            System.out.println("5: Delete");

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
                        System.out.println(t);}
                    break;

                case 3:
                    System.out.println("Enter the Employee id ");
                    sid=scanner.nextInt();
                    System.out.println("Employee ID  | Employee Name  | Employee Salary ");

                    for(int i=0;i<= emp.size();i++) {

//                        System.out.println("sid = "+ sid);
//                        System.out.println("idt ="+emp.get(i).getEmpid() );
                        if (sid==emp.get(i).getEmpid()) {
                            System.out.println( emp.get(i));
                            break;
                        }
//                        System.out.println(i);
                    }
                    break;
                case 4:
                	   System.out.println("Enter the Employee id ");
                        nit=scanner.nextInt();
                       for(int  i=0;i<=emp.size();i++) {

                    	   if (idt==emp.get(i).getEmpid()) {
                               System.out.println("Enter new employee id");
                       fir=scanner.nextInt();
                    System.out.println("Enter Employee Name");
                    sir=scanner.next();
                    System.out.println("Enter the Employee Salary");
                    tir=scanner.nextFloat();
                    emp.get(i).setEmpid(fir);
                    emp.get(i).setEmpname(sir);
                    emp.get(i).setSalary(tir);
                    		   break;
                    	   }
                           j++;
                       }

                    break;
                case 5:
                    System.out.println("Enter the Employee id ");
                    sip=scanner.nextInt();
                    for(int  i=0;i<=emp.size();i++) {

                        if (idt==emp.get(i).getEmpid()) {
                            emp.remove(i);
                            break;
                        }

                    }
                    break;
                default:
                    System.out.println("Enter the right Input");
                    break;
            }

        }



    }


}
