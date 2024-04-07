//Interface is like a class which contact only Abstract method, this require implements
//Interface methods are by default public and abstract
//Interface variable are by default public, static and final
//Interface method must be override inside the implementing classes
//Interface deals between client and developer

import java.util.Scanner;

interface client
{
    void input();//Default Public and Abstract
    void output(); //Default Public and Abstract
}
public class Interface implements client
{
    String name;
    double sal;
    public void input() //if you do not define public it will take default
    {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter User name :");
        name = r.nextLine();
        System.out.println("Enter User Salary :");
        sal = r.nextDouble();
    }

    public void output() //if you do not define public it will take default
    {
        System.out.println(name +"  "+sal);
    }

    public static void main(String[] args) {
        client c = new Interface();
        c.input();
        c.output();
    }
}
