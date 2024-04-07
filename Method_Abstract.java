//for abstract class method should be abstract
//it contact method only and implements in different ways in other class
//Cannot create object for abstract class
abstract class animal
{
    animal() //Constructor
    {
        System.out.println("Animal common properties");
    }
    public abstract void sound();
}

class Dog extends animal
{
    Dog() //Constructor
    {
        super(); //It will call parent properties
    }
    public void sound()
    {
        System.out.println("Dog Barks");
    }
}

class Lion extends animal
{
    Lion() //Constructor
    {
        super(); //It will call parent properties
    }
    public void sound()
    {
        System.out.println("Lion Roar");
    }
}
public class Method_Abstract {
    public static void main(String[] args) {
        Dog r = new Dog();
        r.sound();
        Lion r1 = new Lion();
        r1.sound();
    }
}
