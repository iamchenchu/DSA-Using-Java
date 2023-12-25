package Hashing;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashSetIterator {

    public static void main(String[] args)
    {
        HashSet<String> cities = new HashSet<>();
        cities.add("Tirupati");
        cities.add("Delhi");
        cities.add("Jalandhar");
        cities.add("Banglore");


        for(String city : cities)
        {
            System.out.println(city);
        }

        System.out.println();
        System.out.println();
        System.out.println();

        
        // Iterator it = cities.iterator();
        // while(it.hashNext()){
        //     System.out.println(it.next());
        // }

    }
}
