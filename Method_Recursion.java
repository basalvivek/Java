//Method that call itself
import java.util.Scanner;

class Method_Recursion {

    int sum(int a){
        if (a>0)
        {
            return a+sum(a-1);
        }
        else {
            return 0;
        }
    }

    int Fact(int n)
    {
        if(n==1) return 1;
        else return n*Fact(n-1);
    }

    public static void main(String[] args) {
        Method_Recursion r =new Method_Recursion();
        Scanner ref = new Scanner(System.in);

        //Sum of Natural Numbers
        System.out.print("Enter the Number to Sum : ");
        int s=ref.nextInt();
                int value = r.sum(s);
                System.out.println("Sum of "+s+ " natural number is "+ value);

        //Factorial of given Number
        System.out.print("Enter the Number for Factorial : ");
        int n=ref.nextInt();
            int fact = r.Fact(n);
            System.out.print("Factorial  of "+n+" number is : "+ fact);
    }
}
