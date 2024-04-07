//Multithreading -> By Extending Thread Class
//By Implementing Runnable Interface


class A2 implements Runnable
{
    public void run()
    {
        for (int i=0;i<=5;i++)
        {
            System.out.println("Message from Thread Class");
        }

    }
}

public class MultiThread_Implement
{
    public static void main(String[] args) {
        A2 r=new A2();

        Thread t=new Thread(r);
        t.start();
        for (int i=0;i<=5;i++)
        {
            System.out.println("Message from Main Class");
        }
    }

}
