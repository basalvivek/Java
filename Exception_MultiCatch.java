//More than one exception

import java.lang.reflect.Array;

public class Exception_MultiCatch
{
    public static void main(String[] args)
    {
        try
        {
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
        System.out.println("Cannot Divided by Zero");
        }
        try
        {
            int a[]={10,20,30,40,50};
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("Beyond Array Limit");
        }
    }
}
