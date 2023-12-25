package Hashing;
import java.util.*;

public class HashMapIteration {

    public static void main(String[] args)
    {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China",150);
        hm.put("USA",50);
        hm.put("Indonetia",6);
        hm.put("Nepal", 10);


        //Iterrate using keySet

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys)
        {
            System.out.println("Key ="+k+" , Value ="+hm.get(k));
        }
    }
    
}
