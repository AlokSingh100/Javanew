package if_else;
import java.util.Scanner;


public class ovel_conson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter alphabet");
        char a = sc.next().charAt(0);

        if(a=='a' || a=='A' || a=='e' || a=='E' || a=='i' || a=='I' || a=='o' || a=='O' || a=='u' || a=='U'){
            System.out.println("it a vowel");
        }
        else{
            System.out.println("it is a consonant ");
        }


    }
}
