package loop_nested;



import java.util.Scanner;

class salary_system {
        int salary,gs,ns;
        float HRA,DA,PF,MA=1500;
        String name,id,designation,department;
    void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the name: ");
        name=scanner.next();
        System.out.print("Id: ");
        id=scanner.next();
        System.out.print("Designation: ");
        designation=scanner.next();
        System.out.print("Enter the Department: ");
        department=scanner.next();
        System.out.print("Enter the Salary: ");
         salary=scanner.nextInt();
    }

    float HRA(){
        HRA=salary*20/100;
        return HRA;
    }
    float DA(){
        DA=salary*10/100;
        return DA;
    }
    float PF(){
        PF=salary*12/100;
        return PF;
    }
    int gs(){
        gs= (int) (salary+HRA+DA+PF+MA);
        return gs;
    }
    int ns(){
        ns=(int)(gs()-PF());
                return ns;
    }





    void Output(){
        System.out.println("Employee Salary Details");
        System.out.println("-----------------------");
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Designation: "+designation);
        System.out.println("Department: "+department);
        System.out.println();
        System.out.println("Basic Salary: "+salary);
        System.out.println("House Rent Allowance (HRA): "+ HRA());
        System.out.println("Dearness Allowance (DA): "+DA());
        System.out.println("Medical Allowance:"+MA);
        System.out.println("Provident Fund (PF): "+PF());
        System.out.println();
        System.out.println("Gross Salary: "+gs());
        System.out.println("Net Salary: "+ns());
    }







    public static void main(String[] args) {
        salary_system ss=new salary_system();
        ss.input();
        ss.Output();






        }
    }
