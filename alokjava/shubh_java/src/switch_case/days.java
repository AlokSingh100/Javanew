package switch_case;
import java.util.Scanner;



public class days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        char a =sc.next().charAt(0);

        switch(a) {
            case 'a':
                System.out.println("monday");
                break;
            case 'b':
                System.out.println("tuesday");
                break;
            case 'c':
                System.out.println("wednesday");
                break;
            case 'd':
                System.out.println("thursday");
                break;
            case 'e':
                System.out.println("friday");
                break;
            case 'f':
                System.out.println("saturday");
                break;
            case 'g':
                System.out.println("sunday");
                break;
            default:
                System.out.println("enter proper assign value between a-g");
                break;

        }


    }
}
