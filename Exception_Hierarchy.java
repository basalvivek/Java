//Throwable super class have two subclasses Exception and Error
//Exception: RuntimeException,IOException,SQLException,InterruptedException,ClassNotFoundException
//Error: StackOverFlowError(Stack Memory exhaust),OutOfMemoryError(JVM Memory exhaust) ,IOError(),LinkageError(Verification Linkage Error)
//Super Class of these exception is "Exception" and "Throwable" is super class of Exception
//Java File->java c Compile tile (Error)->Executable Java file.class ->JVM (Exception) and Error related to environment
//try,catch -> user define exception
// throw,throws->JVM handle
// finally->code will run


public class Exception_Hierarchy
{
    public static void main(String[] args)
    {
        try
        {
            String str=null;System.out.println(str.toUpperCase());//java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "str" is null
        }
        catch (NullPointerException e)
        {
            System.out.println("Cannot cast case for Null Value");
        }
        System.out.println("Program Executed till End");
    }

}
