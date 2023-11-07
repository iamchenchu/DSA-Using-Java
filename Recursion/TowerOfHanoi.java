public class TowerOfHanoi {

    public static void toh(int n, char src, char dest, char helper)
    {
        if(n==1)
        {
            System.out.println("move the disk"+n+" from "+ src + " to " + dest);
            return;
        }

        toh(n-1, src, helper, dest);
        System.out.println("move the disk"+n+" from "+ src + " to " + dest);
        toh(n-1, helper, dest, src);

}

public static void main(String[] args)
{
    int n=4;
    toh(n, 'A', 'C', 'B');

}
}


