//Try block -> Risky code
//Catch Block-> Handle Exception
//Finally Block-> Handle resources and execute in any case

public class Exception_TryCatchFinally
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Program started");
            int a=20,b=0,c;
            c=a/b;
            System.out.println(c);
            System.out.println("After Execution");
        }
        catch(ArithmeticException e)
        {
            System.out.println("In Exception Cannot divide by Zero");
        }
        finally
        {
            System.out.println("In Finally Block");
        }
        System.out.println("Program Ended");
    }
}
