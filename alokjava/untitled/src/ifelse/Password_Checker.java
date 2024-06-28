package ifelse;

import java.util.Scanner;

import static java.lang.System.exit;

public class Password_Checker {
    public static void main(String[] args) {
        String pasw,pasw1,paws3,paws4 ;
        int option1,option3,option4 ;
        Scanner sc=new Scanner(System.in);
        System.out.println("set the password ");
         pasw=sc.next();
        System.out.println("enter the password");
          pasw1=sc.next();
        if (! pasw.equals(pasw1)) {
            System.out.println("try again ");
            paws3= sc.next();
            if (!paws3.equals(pasw)){
                System.out.println("try again password");
                paws4=sc.next();
                    if (!pasw.equals(paws4)) {
                        System.out.println("try next year");
                        exit(0);
                    }
                    else System.out.println("current password");
            }
            else System.out.println("current password");

        }
        else System.out.println("current password");


        System.out.println("Q1. What is the capital of France?");
        System.out.println("1. Paris");
        System.out.println("2. London");
        System.out.println("3. Berlin");
        System.out.println("4. Madrid");
        System.out.print("Choose any one option ");
            option1=sc.nextInt();
            switch (option1) {
                case 1:
                    System.out.println("Current Answer");

                    break;
                case 2, 4, 3:
                    System.out.println("Wrong answer Try next time");
                    exit(0);
                    break;
                default:
                    System.out.println("choose between 1 to 4 only try again");
            }

            System.out.println("Q1. Which planet is known as the “Red Planet”");
        System.out.println("1. Venus");
        System.out.println("2. Mars");
        System.out.println("3. Jupiter");
        System.out.println("4. Saturn");
        System.out.print("Choose any one option ");
            option3=sc.nextInt();
            switch (option3) {
                case 1, 4, 3:
                    System.out.println("Wrong answer Try next time");
                    exit(0);
                    break;
                case 2:
                     System.out.println("Current Answer");

                    break;
                default:
                    System.out.println("choose between 1 to 4 only try again");
            }
            System.out.println("Q1. Who wrote the play “Romeo and Juliet”?");
        System.out.println("1.  William Shakespeare");
        System.out.println("2. Jane Austen");
        System.out.println("3. Charles Dickens");
        System.out.println("4. Mark Twain");
        System.out.print("Choose any one option ");
            option4=sc.nextInt();
            switch (option4) {
               case 1:
                    System.out.println("Current Answer");

                    break;
                case 2, 3, 4:
                    System.out.println("Wrong answer Try next time");
                    exit(0);
                    break;
                default:
                    System.out.println("choose between 1 to 4 only try again");
            }
            System.out.println("hello");



    }
}
