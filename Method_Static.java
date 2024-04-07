//Non Static method can call both static and non static variables
//Static method can call only static variables

public class Method_Static {
    int a=10;
    static int b= 20;
    static void Display_static()
    {
        System.out.println("This is an example to display only static variables");
        System.out.println("Static variable "+ b);
    }
    void Display_non_static()
    {
        System.out.println("This is an example to display static and non static variables");
        System.out.println("Non Static variable "+ a +" Static variable "+ b);

    }

    public static void main(String[] args) {
        Method_Static ref = new Method_Static();
        ref.Display_non_static();//Non Static method required reference
        Method_Static.Display_static(); // Static method can call Directly
    }


}