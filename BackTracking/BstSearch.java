public class BstSearch {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root, int val)
    {
        if(root==null)
        {
            root = new Node(val);
            return root;
        }

        if(root.data>val)
        {
            root.left = insert(root.left, val);
        } else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean search(Node root, int key)
    {
        if(root==null)
        {
            return false;
        }

        if(root.data == key)
        {
            return true;
        }
        if(root.data >= key){
            return search(root.left, key);
        
        }
        else{
            return search(root.right, key);
        }

    }

    public static void main(String[] args)
    {
        int values[] = {5,1,3,4,2,7};

        Node root = null;

        if(search(root, 3))
        {
            System.out.println("Found the key");
        }
        else{
            System.out.println("Not found the key in BST");
        }


    }
    
}
