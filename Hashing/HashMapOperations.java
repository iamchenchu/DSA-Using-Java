package Hashing;
import java.util.*;

public class HashMapOperations {

    public static void main(String[] args)
    {
        //create
        HashMap<String,Integer> hm = new HashMap<>();

        //insert
        hm.put("India", 100);
        hm.put("China",150);
        hm.put("USA", 50);

        System.out.println(hm);

        //Get - O(1)

        int population = hm.get("India");
        System.out.println(population);

        //contains(key)
        System.out.println(hm.containsKey("India")); // true
        System.out.println(hm.containsKey("Srilanka")); // false

        //remove(key)

        hm.remove("China");
        System.out.println(hm);
        System.out.println(hm.containsKey("China")); // false as we just deleted china

        // clear()
        hm.clear(); // it will cleare all the nodes in the map
        System.out.println(hm.isEmpty());

        






    }

    
    
}
