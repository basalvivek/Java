//We can achieve multiple inheritance through interfaces becos interface contains only abstract method which implementation is provided by sub classes
interface A
{
    void show();
}

interface B
{
    void show();
}

interface C
{
    void disp();
}

class Multiple_Inheritance implements A,B,C
{
    public void show()
    {
        System.out.println("Interface A and B");
    }
    public void disp()
    {
        System.out.println("Interface Display");
    }
    public static void main(String[] args)
    {
        Multiple_Inheritance m = new Multiple_Inheritance();
        m.show();
        m.disp();
    }

}
