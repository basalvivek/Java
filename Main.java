import java.util.Scanner;

class WhileLoop {
    int i = 1, n;

    void WhileLoop() {
        System.out.println("Enter the Max value for While Loop :");
        Scanner r1 = new Scanner(System.in);
        n = r1.nextInt();

        while (i <= n) {
            System.out.println("The value of i from While Loop is :" + i);
            ++i;
        }
    }
}

class DoWhileLoop {
    int i = 1, n;

    void DoWhile() {

        System.out.println("Enter the Max value for Do-While Loop :");

        Scanner r2 = new Scanner(System.in);
        n = r2.nextInt();

        do {
            System.out.println("The value of i from Do-While Loop is :" + i);
            ++i;
        }
        while (i <= n);
    }

}

class ForLoop
{
        public static void ForLoop()
        {

            int n,i;

            System.out.println("Enter the Max value for For Loop :");
            Scanner r2 = new Scanner(System.in);
            n = r2.nextInt();

            for (i=1;i<=n;i++)
            {
                System.out.println("The value of i from For Loop is :" + i);
            }
        }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to While Loop");
        WhileLoop wl = new WhileLoop();
        wl.WhileLoop();

        System.out.println("Welcome to Do While Loop");
        DoWhileLoop dwl = new DoWhileLoop();
        dwl.DoWhile();

//Public Static
        System.out.println("Welcome to For Loop");
        ForLoop.ForLoop();
    }
}

