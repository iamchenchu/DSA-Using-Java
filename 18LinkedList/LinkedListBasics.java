import java.util.LinkedList;

public class LinkedListBasics {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data)
    {   
         // step1 : create new node
        Node newNode = new Node(data);
        if(head==null)
        {
            head = tail = newNode;
            return;
        }
        //step2 : newNode next = Head
        newNode.next = head; //link

        //step 3 : head = new node
        head = newNode;
    }
    public void addLast(int data)
    {
        if(head==null)
        {
            head = tail = null;
            return;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
    }

    public void print()
    {
        if(head == null)
        {
            System.out.println("The LinkedList is empty");
            return;
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args)
    {
        LinkedListBasics ll = new LinkedListBasics();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();

    }
}
