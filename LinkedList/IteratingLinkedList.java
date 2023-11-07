public class IteratingLinkedList {
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

    public void add(int idx, int data)
    {
        if(head == null)
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while(i<idx-1)
        {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int itrSearch(int key)
    {
        Node temp = head;
        int i = 0;
        while(temp != null)
        {
            if(temp.data == key) // key found case
            {
                return i;
            }
            temp = temp.next;
            i++ ;
        }
        return -1; // for not found case
    }
    public static void main(String[] args)
    {
        IteratingLinkedList ll = new IteratingLinkedList();
      
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 10);
        ll.print();

        System.out.println(ll.itrSearch(2));
        System.out.println(ll.itrSearch(10));


    }
}
