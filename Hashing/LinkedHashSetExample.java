package Hashing;

import java.util.*;

public class LinkedHashSetExample{

    public static void main(String[] args)
    {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Banglore");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Banglore");
        System.out.println(lhs);


    }
}