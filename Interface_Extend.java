interface Gill
{
    void add();
}

interface Raj extends Gill
{
    void sub();
}

class Ankit implements Raj
{

    @Override
    public void add()
    {
        int a=10,b=20,c;
        c=a+b;
        System.out.println("Addition "+c);
    }

    @Override
    public void sub()
    {
        int a=50,b=10,c=0;
        c=a-b;
        System.out.println("Substraction "+c);
    }
}
public class Interface_Extend {
    public static void main(String[] args) {
        Raj r=new Ankit();
        r.add();r.sub();
    }
}
