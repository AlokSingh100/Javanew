package Collection;

public class maxim {


    public static <T extends Number> double maximum(T[] a){
        double add=0;
        double avg;
        int i;
        for ( i = 0; i < a.length; i++) {

//            if (max[i].compareTo(c)>0){
//                c=max[i];
//            }
            add= a[i].doubleValue()+add;
        }

        avg=add/i;
        return avg;

    }

    public static void main(String[] args) {
//        System.out.println("Max "+ maximum(4,5,9));
//        System.out.println("Double max "+ maximum(1.54,73.5,77.45));
//        System.out.println("String max "+ maximum("alok","bala","call"));
        Integer arr[]={2,4,8,10,15};
        Double sat[]={15.15,147.25,198.45,14.68};

        maximum(arr);
        System.out.println(maximum(arr));
        System.out.println(maximum(sat));


    }
}
