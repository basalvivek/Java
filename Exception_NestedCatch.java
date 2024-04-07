//Catch block having another Catch Block

public class Exception_NestedCatch
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println((10/0));
        }
        catch(ArithmeticException e)
        {
            try
            {
                System.out.println("ArithmeticException");
                int a[]={10,20,30};
                System.out.println(a[3]);
            }
            catch(ArrayIndexOutOfBoundsException e1)
            {
                System.out.println("ArrayIndexOutOfBoundsException");
            }
        }
        System.out.println("Program Ended");
    }
}
