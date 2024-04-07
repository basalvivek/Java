//One Super Class and Multiple Sub Class

class super_class1
{
    void add()
    {
        int a=10,b=20;
        int c=a+b;
        System.out.println("From Super Class "+c);
    }
}

class sub1_class1 extends super_class1
{
    void sub()
    {
        int a=200,b=10;
        int c=a-b;
        System.out.println("From Sub1 Class "+c);
    }
}

class sub2_class1 extends super_class1
{
    void mul()
    {
        int a=20,b=10;
        int c=a*b;
        System.out.println("From Sub2 Class "+c);
    }
}

class sub3_class1 extends super_class1
{
    void div()
    {
        int a=200,b=10;
        int c=a/b;
        System.out.println("From Sub3 Class "+c);
    }
}



public class Inheritance_Hierarchical
{
    public static void main(String[] args)
    {
        sub1_class1 r=new sub1_class1();
        r.add();
        r.sub();

        sub2_class1 r1 = new sub2_class1();
        r1.add();
        r1.mul();

        sub3_class1 r2 = new sub3_class1();
        r2.add();
        r2.div();
    }
}
