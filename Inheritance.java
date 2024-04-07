//When one access all the features and properties of another class is Inheritance
//extends keyword to perform
//Code re-usability
//cannot access Private members of class through Inheritance
//Sub class contains all the features of super class, so we create object of Sub class
//Overriding only possible through Inheritance
//Single or Simple (Super->Sub Class)
//Multiple Level (Super->Sub1, Sub2, Sub3....)
//Multiple Inheritance (Not supported by JAVA) but supported thru Interface
//Hierarchical Inheritance (Super->Sub1, Sub2, Sub3....)


class Add_Num
        {

            protected int d=10;
            void Add()
            {
                int a=10,b=20;
                int c=a+b;
                //private int e=10; not allowed
                System.out.println("From Super Class Add "+ c);

            };
            void sub()
            {
                int a=100,b=20;
                int c=a-b;
                System.out.println("From Super Class Sub "+ c);
            };

        }

class Add_More extends Add_Num
{
    void Mul()
    {
        int a=10,b=20;
        int c=a*b;
        d=10;
        System.out.println("From Sub Class Mul "+ c);

    };
    void Div()
    {
        int a=100,b=20;
        int c=a/b;
        System.out.println("From Sub Class Div "+ c);
    };

}

public class Inheritance
{
    public static void main(String[] args)
    {
        Add_More r= new Add_More();
        r.Add();
        r.sub();
        r.Mul();
        r.Div();
        System.out.println("Protected "+r.d);
    }
}
