package loop_nested;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size of array");
        int siz=scanner.nextInt();
        int[] array=new int[siz];
        for (int i = 0; i < siz; i++) {
            System.out.println("Enter the array");
            int put=scanner.nextInt();
            array[i]=put;
        }
        Arrays.sort(array);
        int max=0, e=-1,second = 0;
        for (int i = 0; i < array.length; i++) {
e++;
        }
        e=e-1;
        System.out.println(array[e]);


    }



}
