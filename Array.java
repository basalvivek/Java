import java.util.Scanner;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int size,i,sum=0,counter=0;

        Scanner r = new Scanner(System.in);
        System.out.print("Enter the Size of Array Elements :");
        size = r.nextInt();

        int a[]= new int[size];

        //Input
        System.out.println("Enter the Array Elements :");
        for (i=0;i<size;i++)
        {
            a[i]=r.nextInt();
            sum=a[i]+sum;
        }

        //Display
        System.out.println("Printed Array Elements :");
        for (i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }

        //Reverse Print
        System.out.println("Printed Reverse Array Elements :");
        for (i=size-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }

        //Sum Array
        System.out.println("Sum of the Array Elements :" +sum);

        //Search in Array

        System.out.println("Enter the Search Item in Array List :");
        int n=r.nextInt();
        for (i=0;i<size;i++)
        {
            if (a[i] ==n)
            {
                counter++;
            }
        }
        if (counter > 0)
            System.out.println("Item Found");
         else
            System.out.println("Item Not Found");

         //Sorts
        Arrays.sort(a);
        System.out.println("Printed Sorted Array Elements :");
        for (i=0;i<size;i++)
        {
            System.out.println(a[i]+" ");
        }

        // Input and Print two Dimensional Array
        int c[][]= new int[3][3];

        System.out.println("Enter Array Element for two Dimension Array");

        for(i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]= r.nextInt();
            }
        }
        System.out.println("Printed Array Element for two Dimension Array");

        for(i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
