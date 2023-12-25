public class BinToDecimal{

    public static void toDecimal(int binNo)
    {
        int pow =0;
        int decNo = 0;

        while (binNo>0)
        {
            int lastDigit = binNo % 10;
            decNo = decNo + (lastDigit*(int)Math.pow(2,pow));

            pow++;
            binNo = binNo/10;
        }

        System.out.print("decimal of "+ binNo + " = "+ decNo);

    }


    public static void main(String[] args)
    {

        toDecimal(10110);

    }
}