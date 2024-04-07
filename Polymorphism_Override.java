//In the case of overridden It will call sub class
//In the case of not overridden, it will call mainclass
//

class shape
{
    void draw()
    {
        System.out.println("Don't know about Shape");
    }
}

//Overridden
class square extends shape
{
    @Override
    void draw()
    {
        super.draw();
        System.out.println("Square Shape");
    }
}

//Not overridden
class circle extends shape
{

    void draw_new()
    {
        System.out.println("Circle Shape");
    }
}

public class Polymorphism_Override {
    public static void main(String[] args) {
        shape r=new square();
        r.draw();
        shape r1=new circle();

        r1.draw();
    }
}
