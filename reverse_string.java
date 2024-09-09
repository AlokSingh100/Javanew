package macro;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sa=new Scanner(System.in);
        String as=sa.nextLine();
        char a;String b="";
        for (int i = 0; i < as.length(); i++) {
            a=as.charAt(i);
            b=a+b;
        }
        System.out.println(b);
    }
}
