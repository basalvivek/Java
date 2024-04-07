//Exception is unexpected/unwanted/abnormal situation that occurred at runtime

public class Exception_01 {
    public static void main(String[] args) {
        System.out.println("Main method Start");
        int a=10,b=0,c;
        try
        {
            c=a/b; //Code which need to handle
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot Divide by Zero");
        }
        catch(Exception e)
        {
            System.out.println(e);//java.lang.ArithmeticException: / by zero
            System.out.println("Cannot Divide by Zero");
        }
        System.out.println("Main method End");
    }
}
