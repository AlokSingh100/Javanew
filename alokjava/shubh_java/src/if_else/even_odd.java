package if_else;
import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();

        if (num%2==0){
            System.out.println("it is an even number ");
        }
        else{
            System.out.println("it is an odd number");
        }
    }
}
