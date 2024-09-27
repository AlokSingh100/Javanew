package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Arrlist {
    public static void main(String[] args) {
        List<String> pick=new ArrayList<>();
        pick.add("Apple");
        pick.add("nifr");
        pick.add("Saf");

//        System.out.println(pick);
//
//        for (String a:pick){
//            System.out.println(a);
//        }
        Iterator<String> str=pick.iterator();
        while (str.hasNext()){
            System.out.println(str.next());
        }

        pick.add(3,"nasa");
        pick.set(2,"has");
        pick.remove(1);
        System.out.println(pick);
        String pick1[]={"nat","tat","lat"};
        List<String> pik= Arrays.asList(pick1);
        System.out.println(pik);
        pick.addAll(pik);
        System.out.println(pick);
    }
}
