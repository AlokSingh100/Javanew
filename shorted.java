package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class shorted {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number size");
        int t=scanner.nextInt();
        System.out.println("Enter the number ");
        int[] num =new int[t];
        for (int i = 0;i< num.length; i++) {
            System.out.print((i+1)+"number is = ");
            int a=scanner.nextInt();
             num [i]= a;
             if (a<1 || a>1000){
                 break;
             }
        }
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

}
