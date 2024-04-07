//Finally contain another Finally block

public class Exception_NestedFinally
{
    public static void main(String[] args)
    {
        try
        {
            String a = "test";
            System.out.println(a.toUpperCase());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                System.out.println(10/0);
            }
            catch(ArithmeticException e1)
            {
                System.out.println("ArithmeticException in Finally Block");
            }
            finally
            {
                System.out.println("In Finally Block");

            }
        }
        System.out.println("Program End");
    }
}
