package loop_nested;

import java.util.Scanner;

public class twodloop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the row");
        int row=scanner.nextInt();
        System.out.println("enter the col");
        int col=scanner.nextInt()
                ;
        System.out.println("Enter the number");
        int[][] array=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                int a=scanner.nextInt();
                array[i][j]=a;
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
    }
}
