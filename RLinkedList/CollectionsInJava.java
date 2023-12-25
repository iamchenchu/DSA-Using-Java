import java.util.LinkedList;

public class CollectionsInJava {


    public static void main(String[] args)
    {
    //crete 
    LinkedList<Integer> ll= new LinkedList<>();

    //add
    ll.addLast(1);
    ll.addLast(2);
    ll.addFirst(0);

    //print
    System.out.println(ll);

    // remove
    ll.removeFirst();
    ll.removeLast();

    System.out.println(ll);


}
    
}
