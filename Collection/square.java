package Collection;

import java.util.Scanner;

public class square <n extends Number>{
    n number;


    public square(n number) {
        this.number = number;
    }

    public int getNumber() {
        return number.intValue()*number.intValue();
    }

    public void setNumber(n number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "The Square number is " +getNumber();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();

        square<Integer> numb=new square<Integer>(num);
        System.out.println(numb);


    }
}
