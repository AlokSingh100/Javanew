package ifelse;



import java.util.Scanner;

public class salary_system {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name,id ,mounthselect;
        int  salary, Month, monthDay = 0, year,leaves,Conveyance,Medical,OtherA,Professionalt,PaidD;
        float allowance,leavesAmount,Ysalary,CTC,conveyAmount,medicalAmount,otherAmount,mounthallowance,ProfessionalAmount,mounthnetSalary,TotalDeductions,netsalary;
        mounthselect="";
        System.out.print("Enter the name: ");
        name=sc.next();
        System.out.print("Enter the Employee id: ");
        id=sc.next();

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
        switch (Month) {
            case 1:
                monthDay = 31;
                mounthselect = "January";
                break;
            case 2:
                if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
                    monthDay = 29;
                } else monthDay = 28;
                mounthselect = "February";
                break;
            case 3:
                monthDay = 31;
                mounthselect = "March";
                break;
            case 4:
                monthDay = 30;
                mounthselect = "April";
                break;
            case 5:
                monthDay = 31;
                mounthselect = "May";
                break;
            case 6:
                monthDay = 30;
                mounthselect = "June";
                break;
            case 7:
                monthDay = 31;
                mounthselect = "July";
                break;
            case 8:
                monthDay = 31;
                mounthselect = "August";
                break;
            case 9:
                monthDay = 30;
                mounthselect = "September";
                break;
            case 10:
                monthDay = 31;
                mounthselect = "October";
                break;
            case 11:
                monthDay = 30;
                mounthselect = "November";
                break;
            case 12:
                monthDay = 31;
                mounthselect = "December";
                break;
            default:
                System.out.println("enter Between 1 to 12 ");
        }
                //calculation
            PaidD=monthDay-leaves;
            leavesAmount=(float)(salary/monthDay)*(leaves);
            Ysalary=salary*12;
            conveyAmount=(float) Ysalary*Conveyance/100;
            otherAmount=(float) Ysalary*OtherA/100;
            medicalAmount=(float) Ysalary*Medical/100;
            allowance=conveyAmount+otherAmount+medicalAmount;
            mounthallowance=allowance/12 ;
            CTC=Ysalary+allowance;
            mounthnetSalary=salary-leavesAmount;
            ProfessionalAmount=(float) mounthnetSalary*Professionalt/100;
            TotalDeductions=leavesAmount+ProfessionalAmount;
            netsalary=mounthnetSalary+mounthallowance-TotalDeductions;
        System.out.println();
        System.out.println();
        System.out.println("------Output---------");
        System.out.println();
        System.out.println();

                System.out.println("Employee Name= " +name);
                System.out.println("Employee Id ="+ id);
                System.out.println("Paid Days = "+ PaidD);
                System.out.println("Basic Salary= "+ salary);
                System.out.println("Total Working Days = "+ monthDay);
                System.out.println("Leaves Amount ="+ leavesAmount);
                System.out.println("Conveyance Allowance ="+ conveyAmount);
                System.out.println("Other Allowance ="+ otherAmount);
                System.out.println("Medical Allowance ="+ medicalAmount);
                System.out.println("CTC =" + CTC);
                System.out.println("Total Allowance =" +allowance);
                System.out.println("Professional Tax = " + ProfessionalAmount);
                System.out.println("Total Deductions = "+ TotalDeductions);
                System.out.println("Net Salary = " +netsalary);
                System.out.println("Month = " +mounthselect+"/"+year);







        }
    }
