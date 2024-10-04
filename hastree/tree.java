package hastree;

import java.util.HashMap;
import java.util.Map;

public class tree {
    public static void main(String[] args) {
        HashMap<Integer,String> set=new HashMap<Integer, String>();
        set.put(1,"asdf");
        set.put(2,"sepal");
        set.put(3,"sea appal");
        set.put(4,"Note");
        System.out.println(set.keySet());
        System.out.println(set.values());
        System.out.println(set.entrySet());
        for (HashMap.Entry<Integer,String> pat:set.entrySet()){
            System.out.println(pat);
        }
    }
}
