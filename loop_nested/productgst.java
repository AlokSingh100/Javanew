package loop_nested;

import java.util.Scanner;

public class productgst {

















    public static void main(String[] args) {
          int b=0,c,a,totalprice;
    String d,p;
        Scanner scanner=new Scanner(System.in);
        System.out.println("New product Section");
        int[] pric =new int[1000];
        String[] prodct=new String[1000];
        int[] Quantity = new int[1000];
        for (int i = 0; i < 1000; i++) {
            b++;
        System.out.println("Enter the product No. "+ b);
            d=scanner.next();
            prodct[i]=d;
        System.out.println("Enter "+d+" Price");
            a= scanner.nextInt();
            pric[i]=a;
        System.out.println("Enter The "+d+" Quantity");
           c=scanner.nextInt();
            Quantity[i]=c;
        System.out.println("----------------------------");
        System.out.println("Do you Want to add more [Y/N]");
        p=scanner.next();
            if (p.equals("N")||p.equals("n"))
               break;

            }


        for (int i = 0; i < b; i++) {
            System.out.println(pric[i]);
        }
        for (int i = 0; i < b; i++) {

        }
    }
}
