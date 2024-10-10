package Collection;

import java.util.Arrays;

public class stemparry<T extends Number> {
T num[];

    public stemparry(T[] num) {
        this.num = num;
    }


    public double avg(){
       double b=0;
       int a=0;
        for ( a = 0; a < num.length; a++) {
             b = num[a].doubleValue() + b;

        }
        double p=b/a;
        return p;

    }



    public static void main(String[] args) {
        Integer i[]={7,8,4,16};
        stemparry<Integer>ob =new stemparry<Integer>(i);
        System.out.println(ob.avg());
    }
}
