class A1 extends Thread
{
    public void run()
    {
        try {
            for (int i = 0; i < 5; i++)
            {
                System.out.println("Message from Thread " + i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

public class MultiThread {
    public static void main(String[] args) throws Exception
    {
        A1 t=new A1();
        t.start();
        for (int i=0;i<5;i++)
        {
            System.out.println("Message from Main "+i);
            Thread.sleep(1000);
        }
    }
}
