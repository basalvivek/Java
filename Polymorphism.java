//Poly -> Many
//Morphism -> Form
//Polymorphism is a greek word meaning "Same Object having different behaviour"
//Compile time Polymorphism-> is existing at time of compilation called compile time,early binding or static Polymorphism.
//Method overloading, same name with different parameter list

class P1
{
    void add()
    {
        int a=10,b=20,c;
        c=a+b;
        System.out.println(c);
    }
    void add(int x,int y)
    {
        int c;
        c=x+y;
        System.out.println(c);
    }
    void add(int x,double y)
    {
        double c;
        c=x+y;
        System.out.println(c);
    }
    int add(int a)
    {
        int b=20,c;
        c=a+b;
        return(c);
    }
}
public class Polymorphism
{
    public static void main(String[] args)
    {
    P1 r = new P1();
    r.add();
    r.add(100,200);
    r.add(1000,200.50);

    int add=r.add(10);
    System.out.println(add);


    }
}

