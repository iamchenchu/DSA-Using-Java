import java.util.ArrayList;

public class FindMaxmimum {

public static void swap(ArrayList<Integer> list, int idx1, int idx2)
{
    int temp = list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2,temp);

    System.out.println(list);

}

public static void main(String[] args)
{
    ArrayList<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(8);
    list.add(6);
    list.add(5);
    list.add(4);

    System.out.println(list);

    Integer max = Integer.MIN_VALUE;

    for(int i = 0; i<list.size();i++)
    {
        if(max<list.get(i))
        {
            max = list.get(i);
        }
    }
    System.out.println(max);

    //to swap elements is the below code 

    int idx1 =1,idx2 = 3;

    System.out.println(list);

    swap(list, idx1, idx2);

}
    
}
