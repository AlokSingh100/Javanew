package loop_nested;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        String a,chose;
        int to,arraylenght,get,gst,gs1;
        to=0;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number of product");

        arraylenght=scanner.nextInt();
        System.out.println( "please enter the product");
        String[] product = new String[arraylenght];

        for (int i = 0; i < product.length; i++) {
            System.out.print("Product No."+ (i+1)+" ");
        a=scanner.next();
        product[i]=a;
        }
        System.out.println("Enter the price");
        int[] prise=new int[arraylenght];
        for (int f = 0; f < prise.length ; f++) {
             System.out.print("Price of product No."+ (f+1)+" ");
         get=scanner.nextInt();
            prise[f]=get;
        }
        for (int p = 0; p < prise.length; p++) {
            to=prise[p]+to;

        }
        for (int p = 0; p < arraylenght; p++) {
            System.out.println((p+1)+" "+  product[p]+" Prise is "+prise[p]);
        }
        System.out.println("Do you want to add GST (Y/N)");
        chose=scanner.next();
        if (chose.equals("y") || chose.equals("Y")){
            System.out.println("Enter the gst percent");
            gst=scanner.nextInt();
            gs1=to*gst/100;
            System.out.println("The total prise is "+ (gs1+to));
        }
         else if (chose.equals("n") || chose.equals("N")) {
             System.out.println(to);
        }
       else System.out.println("Choose the currect option");


    }
}
