package Heaps;

import java.util.PriorityQueue;

public class PriorityQueueCreation {

    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3);
        pq.add(7);
        pq.add(1);
        pq.add(5);
        pq.add(10);
        pq.add(6);


        while(!pq.isEmpty())
        {
            System.out.println(pq.peek());
            pq.remove();
        }


    }
    
}
