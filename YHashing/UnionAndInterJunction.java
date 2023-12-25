package Hashing;

import java.util.HashSet;

public class UnionAndInterJunction {

    public static void main(String[] args)
    {

        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet<Integer> set = new HashSet<>();

        //union
        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);  
        }

        for(int i=0; i<arr2.length;i++)
        {
            set.add(arr2[i]);
        }

        System.out.println("the count of elements after union of the 2 arrays :" + set.size());

        set.clear(); // it will clear all the elements in the set as we do not need them anymore

        //Intersection
        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);  
        }
        int count =0;

        for(int i=0;i<arr2.length;i++)
        {
            if(set.contains(arr2[i]))
            {
                count++;
                set.remove(arr2[i]);

            }
        }

        System.out.println("the count of elements after Intersection of the 2 arrays :" + count);



    }
    
}
