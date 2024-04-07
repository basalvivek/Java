//One super class and multiple subclass


class super_class
{
    void add()
    {
        int a=10,b=20;
        int c=a+b;
        System.out.println("From Super Class "+c);
    }
}

class sub1_class extends super_class
{
    void sub()
    {
        int a=200,b=10;
        int c=a-b;
        System.out.println("From Sub1 Class "+c);
    }
}

class sub2_class extends sub1_class
{
    void mul()
    {
        int a=20,b=10;
        int c=a*b;
        System.out.println("From Sub2 Class "+c);
    }
}

class sub3_class extends sub2_class
{
    void div()
    {
        int a=200,b=10;
        int c=a/b;
        System.out.println("From Sub3 Class "+c);
    }
}

public class Inheritance_MultiLevel
{
    public static void main(String[] args)
    {
        sub3_class r=new sub3_class();
        r.add();
        r.sub();
        r.mul();
        r.div();
    }
}
