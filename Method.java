// Method is same as Function, Method is group of block of code which take input from user, process it and give output.
// There are two type Pre-define and User Define
// In Java method can be call only inside Class
// It improve LOC and decrease code, readability and use of repeat code
// Rule: Definition and calling, you cannot call non static method from Static method, you need to create object

public class Method {
    void Display()
    {
        System.out.println("This is an example of Void Method and Object need to create while calling");
    }
    public static void Display_1()
    {
        System.out.println("This is an example of Public Static Method, No need to create object while calling");
    }

    public static void main(String[] args) {
        Method ref = new Method();
        ref.Display();
        Method.Display_1(); // Direct call
    }


}
