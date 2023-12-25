package Heaps;

import java.util.PriorityQueue;

public class PriorityQueuewithClass {

        static class Student implements Comparable<Student>{  // overriding
        String name;
        int rank;

        public Student(String name, int rank)
        {
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2)    // will compare it's object witht he class object and take the best one and keep sorting
        {
            return this.rank - s2.rank;
        }
    }


    public static void main(String[] args)
    {

        PriorityQueue<Student> pq = new PriorityQueue<>();   // if we new PriorityQueue<>(Comparator. reverseOrder())  then the output will print in reverse order

        pq.add(new Student("A", 5));
        pq.add(new Student("B", 51));
        pq.add(new Student("C", 15));
        pq.add(new Student("D", 6));
        pq.add(new Student("E", 1));
        pq.add(new Student("F", 9));
        pq.add(new Student("G", 11));

        while (!pq.isEmpty()) {

            System.out.println(pq.peek().name + "-->"+pq.peek().rank);
            pq.remove();
            
        }


    }
    
}
