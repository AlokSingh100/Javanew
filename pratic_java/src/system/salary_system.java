package system;

import java.util.Scanner;

public class salary_system {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name,id;
        int  salary, Month, monthDay, year,leaves,Conveyance,Medical,OtherA,Professionalt,PaidD;
        float allowance,leavesAmount,Ysalary,CTC,conveyAmount,medicalAmount,otherAmount,ProfessionalAmount,mounthnetSalary,TotalDeductions,netsalary;

        System.out.print("Enter the name: ");
        name=sc.next();
        System.out.print("Enter the Employee id: ");
        id=sc.next();
        System.out.println("Enter the month in Number");
        System.out.print("Enter the Current Year: ");
        year =sc.nextInt() ;
        System.out.print("Enter the Leaves Taken IN this Month: ");
        leaves =sc.nextInt() ;
        System.out.print("Enter the monthly Salary : ");
        salary =sc.nextInt() ;
            System.out.print("Enter the Conveyance Allowance in Percentage: ");
        Conveyance =sc.nextInt() ;
             System.out.print("Enter the Medical Allowance in Percentage: ");
        Medical =sc.nextInt() ;
            System.out.print("Enter the Other Allowances in Percentage: ");
        OtherA =sc.nextInt() ;
            System.out.print("Enter the Professional Tax in Percentage: ");
        Professionalt =sc.nextInt() ;
        System.out.print("Enter the Current Month: ");
        Month =sc.nextInt();
        monthDay=0;
        switch (Month){
            case 1:
                monthDay=31;
                break;
            case 2:
                monthDay=30;
                break;
            case 3:
                monthDay=31;
                break;
            case 4:
                monthDay=30;
                break;
            case 5:
                monthDay=31;
                break;
            case 6:
                monthDay=30;
                break;
            case 7:
                monthDay=31;
                break;
            case 8:
                monthDay=31;
                break;
             case 9:
                monthDay=30;
                break;
            case 10:
                monthDay=31;
                break;
            case 11:
                monthDay=30;
                break;
            case 12:
                monthDay=31;
                break;
            default:

                //calculation
            PaidD=monthDay-leaves;
            leavesAmount=(float)(salary/monthDay)*(PaidD-monthDay);
            Ysalary=salary*12;
            conveyAmount=(float) Ysalary*Conveyance/100;
            otherAmount=(float) Ysalary*OtherA/100;
            medicalAmount=(float) Ysalary*Medical/100;
            allowance=conveyAmount+otherAmount+medicalAmount;
            CTC=Ysalary+allowance;
            mounthnetSalary=salary-leavesAmount;
            ProfessionalAmount=(float) mounthnetSalary*Professionalt/100;
            TotalDeductions=leavesAmount+ProfessionalAmount;
            netsalary=mounthnetSalary+allowance-TotalDeductions;



            //output:
                System.out.println("Paid Days = "+ PaidD);









        }
    }
}
