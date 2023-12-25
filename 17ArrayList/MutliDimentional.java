import java.util.ArrayList;

public class MutliDimentional {

    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list1.add(1);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        for(int i=0; i<5;i++)
        {
            list1.add(i*1);
            list2.add(i*3);
            list3.add(i*5);
        }

       mainList.add(list1);
       mainList.add(list2);
       mainList.add(list3);

       System.out.println(mainList);


       //traverse an arrayList

       for(int i=0; i<mainList.size();i++)
       {
         ArrayList<Integer> currList = mainList.get(i);

         for(int j=0; j<currList.size();j++)
         {
            System.out.print(currList.get(j)+" ");
         }
         System.out.println();
       }

    }
    
}
