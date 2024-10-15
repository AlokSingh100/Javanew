package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.time.chrono.JapaneseEra.values;

public class consumer {
    public static void main(String[] args) {
        Map<cars,String> ob=new HashMap <cars,String>() ;
        ob.put(new cars("suzaki",500,455,4550000.00),"Huv");
        ob.put(new cars("HUNDA cITY",15154,1114,1454.4524),"sEDAN");
        ob.put(new cars("mARUTI",15154,1114,1454.4524),"HACHBACK");
        Scanner scanner=new Scanner(System.in);
        String type=scanner.next();
        for (Map.Entry<cars,String> obs:ob.entrySet());
        {
            if (type.equals(ob.values())){
                System.out.println(ob.entrySet());
            }
        }
    }
}
