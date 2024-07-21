package loop;

import java.util.Scanner;

public class Student_Report_Card {
    String Name, Id;
    int java, c_plus, Go, Ruby, C_sharp, python, total = 100, Pass_Marks = 40;

    void value() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name ");
        Name = scanner.next();
        System.out.print("Enter Your Roll Number: ");
        Id = scanner.next();
    }

    void Marks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Java Mark");
        java = scanner.nextInt();
        System.out.println("Enter the C++ Mark");
        c_plus = scanner.nextInt();
        System.out.println("Enter the GO Mark");
        Go = scanner.nextInt();
        System.out.println("Enter the Ruby Mark");
        Ruby = scanner.nextInt();
        System.out.println("Enter the C_sharp Mark");
        C_sharp = scanner.nextInt();
        System.out.println("Enter the Python Mark");
        python = scanner.nextInt();

    }

    void output() {
        System.out.println("Student Report Card");
        System.out.println("-------------------");
        System.out.print("Name :" + Name);
        System.out.println();
        System.out.println("Roll Number: " + Id);
        System.out.println();
        System.out.println("Marks: ");
        System.out.println();
        System.out.println();
        if (java >= Pass_Marks)
            System.out.println("Java = " + java + "/" + total);
        else System.out.println("Java = " + java + "/" + total + "F");
        if (c_plus >= Pass_Marks)
            System.out.println("C++ = " + c_plus + "/" + total);
        else System.out.println("C++ = " + c_plus + "/" + total + "F");
        if (Go >= Pass_Marks)
            System.out.println("Go = " + Go + "/" + total);
        else System.out.println("Go = " + Go + "/" + total + "F");
        if (Ruby >= Pass_Marks)
            System.out.println("Ruby = " + Ruby + "/" + total);
        else System.out.println("Ruby = " + Ruby + "/" + total + "F");
        if (C_sharp >= Pass_Marks)
            System.out.println("C# = " + C_sharp + "/" + total);
        else System.out.println("C# = " + c_plus + "/" + total + "F");
        if (python >= Pass_Marks)
            System.out.println("Java = " + python + "/" + total);
        else {
            System.out.println("Java = " + python + "/" + total + "F");
        }
        System.out.println();
    }

    int total() {
        int total = java+c_plus+python+Ruby+C_sharp+Go;
        return total;
    }

    float percent() {
        float percent = (float) (total()*100)/600;
        return percent;
    }
float percent=percent();
    void final1() {
        if (Pass_Marks <= java && Pass_Marks <= python && Pass_Marks <= Go && Pass_Marks <= Ruby && Pass_Marks <= c_plus && Pass_Marks <= C_sharp && percent <= Pass_Marks)
        {
            System.out.println("Status : Pass");
            if (percent() >= 80){
                System.out.println("You got Grade A");}
            else if (percent() >= 60){
                System.out.println("You got Grade B");}
            else if (percent() >= 40) {
                System.out.println("You got Grade C");
            }
        }
            else System.out.println("Status : Fail");


    }

        public static void main (String[]args){
            Student_Report_Card whil = new Student_Report_Card();


            whil.value();
            whil.Marks();
            whil.output();

            System.out.println("Total =" + whil.total() + "/ 600");
            System.out.println("Percentage =" + whil.percent() + "%");
            whil.final1();

        }
    }

