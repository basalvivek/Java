//Multiple method in same class
//Instance variable to used by other method
//local variable to use by same method


import java.util.Scanner;

public class Method_Multi {

    int n1,n2,add,multi; //Instance Variables

    void user_input(){
        Scanner r = new Scanner(System.in);
        {
            System.out.print("Enter the value of first number: ");
                    n1=r.nextInt();

            System.out.print("Enter the value of first number: ");
            n2=r.nextInt();
        }
    }

    void process(){
        add=n1+n2;
        multi=n1*n2;
    }
    void output(){
        System.out.println("Sum of two number is : "+add);
        System.out.println("Multiply of two number is : "+multi);


    }
    public static void main(String[] args)
    {
        Method_Multi r = new Method_Multi();
        r.user_input();
        r.process();
        r.output();


    }
}
