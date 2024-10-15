package Basic;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.time.chrono.JapaneseEra.values;

    public class consumer {
        public static void main(String[] args) {
            Map<String,cars> ob=new HashMap <String,cars>() ;
            ob.put("HUV",new cars("suzaki",500,455,4550000.00));
            ob.put("SEDAN",new cars("HUNDA cITY",15154,1114,1454.4524));
            ob.put("HATCHBACK",new cars("mARUTI",15154,1114,1454.4524));
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter The Car Type" );
            String type=scanner.next();
            for (Map.Entry<String,cars> obs:ob.entrySet())
            {
                if (obs.getKey().equals(type)){
                    System.out.println(obs.getValue());

                }
            }
        }
    }

