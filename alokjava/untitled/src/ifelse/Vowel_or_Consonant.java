package ifelse;

import java.util.Scanner;

public class Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the alphabet ");
        char p = sc.next().charAt(0);
        if (p=='a' || p=='e' || p=='i' || p=='o' || p=='u' )
            System.out.println("Your word is Vowel");
        else System.out.println("Your word is Consonant");

    }
}
