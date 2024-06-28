package ifelse;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a= sc.nextInt();
        if(a%2==0)
            System.out.println("It is even Number");
        else System.out.println("It is odd Number");

    }
}
