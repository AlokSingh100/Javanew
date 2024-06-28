package ifelse;

import java.util.Scanner;

public class Check_Leap_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year =sc.nextInt();
        if ((year % 400==0) || ((year % 100 !=0) && (year %4 ==0))) {
            System.out.println("This is leap year");
        }
        else System.out.println("it is not a leap year");
    }
}
