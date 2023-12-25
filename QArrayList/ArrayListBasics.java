import java.util.ArrayList;

public class ArrayListBasics {

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();


        // Add Elements to the arraylist O(1)

        list.add(1);
        System.out.println(list);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // another method to add an element at an exact index  this will happen at O(n)
        // first parameter is an index and 2nd parameter is an element
        list.add(2,10);
        System.out.println(list);

        // get(index) will return an element at that perticuler index
        int element = list.get(2);
        System.out.println(element);

        //Deleting or Removing an element remove(index) O(n)
        list.remove(3);
        System.out.println(list);

        //set an element at an specific index set(index, element), the previous elements would be deleted
        list.set(2,10);
        list.set(1,11);
        System.out.println(list);

        // contains element Boolean O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(10));
        System.out.println(list.contains(15));

        // size of an arraylist
        System.out.println(list.size());

        //iterate the all the list elements
        System.out.println(list.size());
        System.out.println(list);


        //iterating an araylist
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    
}
