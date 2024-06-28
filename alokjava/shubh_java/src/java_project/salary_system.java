package java_project;
import java.util.Scanner;
//      User Input
//----------------
//Employee ID  = OA90
//Employee Name = Omji
//Month = 3
//year = 2024
//Leaves = 14
//Conveyance Allowance = 5%
//Medical Allowance = 10%
//Other Allowances = 3%
//Salary Basic = 56000/-
//Professional Tax = 10%
//----------------
//Paid Days = 17 Days (Leave Days - Month Days)
//Basic Salary = 56000/-
//Total Working Days = 31 (Month Days)
//Leaves Amount =  25290.32 (Month Days - Leave Days)
//Conveyance Allowance = 33600/-  (Yearly Salary*Conveyance Allowance/100)
//Medical Allowance =  67200/- (Yearly Salary*Medical Allowance/100)
//Other Allowances = 20160/- (Yearly Salary*Other Allowances/100)
//CTC = 786240/- ((Monthly Salary *12)+Conveyance Allowance+Medical Allowance+Other Allowances)
//Total Allowance = 120960/- (Conveyance Allowance+Medical Allowance+Other Allowances)
//Professional Tax = 2276.12/- (Basic Salary - leave amount ) - (Total Salary*Professional Tax/100)
//Total Deductions = 27566.12/- (Professional Tax + Leaves Amount ) - Basic Salary
//Total Earnings Allowance  Monthly = 10080/- (Conveyance Allowance+Medical Allowance+Other Allowances)
//Net Salary   = 28434/- (Total Earnings Allowance  Monthly + Basic Salary) - Total Deductions
//Month = 	March/2024

public class salary_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("//////////////////////////////////////user input///////////////////////////////////////////////");
        int id;
        String month;
        int year;
        String name;
        System.out.println("enter employee id");
        id = sc.nextInt();
        System.out.println("enter employee name");
        name = sc.next();
        System.out.println("enter the year");
        year = sc.nextInt();


        if ((year % 400 == 0 || year % 100 != 0) && (year % 4 == 0)) {
            System.out.println("it is a leap year");

        } else {
            System.out.println("it is not a leap year");
        }
        System.out.println("enter the month");
        month = sc.next();
        if (month.equals("january") || month.equals("march") ||month.equals("may") ||month.equals("july") ||month.equals("august") ||month.equals("october") ||month.equals("december") ){
            System.out.println("31 days");
        }
        else if(month.equals("april") ||month.equals("june") ||month.equals("june") ||month.equals("september") ||month.equals("november")){
            System.out.println("30 days");
        }
//
//
       else if(month
//
//
//
//        else if
//         System.out.println("february has 28 days");
//
//         else{
//            System.out.println("month has 28 days");
//        }
//
//
//


    }
}
