//One Try and Multiple Catch
public class Exception_OneTryMultiCatch
{
    public static void main(String[] args)
    {
        try
        {
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);

            int arr[]={10,20,30};
            System.out.println(arr[3]);

            String str=null;
            System.out.println(str.toUpperCase());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Out of Bound");
        }
        catch(ArithmeticException e1)
        {
            System.out.println("ArithmeticException");
        }
        catch(NumberFormatException e2)
        {
            System.out.println("NumberFormatException");
        }
        catch(Exception e3)
        {
            System.out.println("Exception Super Class, all type exception");
        }
    }
}
