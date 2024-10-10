package Collection;

import java.util.ArrayList;
import java.util.List;

public class overload {
//    public static void show(int a,int b,int c){
//        System.out.println(a+" | "+b+" | " +c);
//    }
//     public static void show(double a,double b,double c){
//        System.out.println(a+" | "+b+" | " +c);
//    }
//     public static void show(String a,String b,String c){
//        System.out.println(a+" | "+b+" | " +c);
//    }
    static void test (List <? extends Number> Is ){
        for (Object ob:Is){
            System.out.println(ob);
        }
    }
    static <T extends Number> void show(T a,T b,T c){
        System.out.println(a+" | "+b+" | "+c);
    }

    public static void main(String[] args) {
        
        show(12,12,11);
        show(1.22,45.24,47.57);
        List <overload> ob=new ArrayList<overload>();

//        show("!1","ont2","fifty");
    }
}
