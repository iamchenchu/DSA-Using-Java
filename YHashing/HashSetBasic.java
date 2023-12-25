
package Hashing;

import java.util.*;

public class HashSetBasic {

    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);

        System.out.println(set);

        System.out.println(set.size());
        
        System.out.println(set.isEmpty());

        System.out.println(set.contains(5));

        set.remove(5);

        System.out.println(set.contains(5));

        System.out.println(set.size());

        set.clear();

        System.out.println(set.size());

        System.out.println(set.isEmpty());




        


    }


    
}
