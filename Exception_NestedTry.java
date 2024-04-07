//Try block which contain another try block

public class Exception_NestedTry
{
    public static void main(String[] args)
    {
        try
        {
            try
            {
                int a[]={10,20,30};
                System.out.println(a[3]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("ArrayIndexOutOfBoundsException");
            }
            System.out.println(10/0);
        }
        catch(ArithmeticException e1)
        {
            System.out.println("ArithmeticException");
        }
        System.out.println("Program Ended");
    }
}
