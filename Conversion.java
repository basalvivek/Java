import java.util.Scanner;

class DecToHexa {
    int decimal, rem = 0;
    char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    String hexaValue = "";

    void DecToHexa() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to convert Decimal to Hexa :");
        decimal = in.nextInt();

        while (decimal > 0) {
            rem = decimal % 16;
            hexaValue = hexa[rem] + hexaValue;
            decimal = decimal / 16;
        }
        System.out.println("Hexa value is :" + hexaValue);
    }
}

class DecToOct {
    int dec_num, i, temp;
    int oct_num[] = new int[100];

    void DecToOct() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to convert Decimal to Octal:");
        dec_num = in.nextInt();
        temp = dec_num;

        while (temp != 0) {
            oct_num[i] = temp % 8;
            //System.out.println("oct_num " + oct_num[i]);
            temp = temp / 8;
            //System.out.println("temp "+ temp);
            i++;
        }

        System.out.print("Octal value of " +dec_num+ " is : ");
        for (int j=i-1;j>=0;j--){
            System.out.print(oct_num[j]);
        }
    }
}


class DecToBin {
    int bin, i, temp;
    int bin_num[] = new int[100];

    void DecToBin() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to convert Decimal to Binary:");
        bin = in.nextInt();

        while (bin != 0) {

            bin_num[i] = bin % 2;
            bin = bin / 2;
            i++;
        }
        System.out.print("Binary value is : ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(bin_num[j]);

        }
    }
}

public class Conversion {

    public static void main(String[] args){
        DecToHexa r = new DecToHexa();
        r.DecToHexa();

        DecToOct r1 = new DecToOct();
        r1.DecToOct();
        System.out.print("\n");
        DecToBin r2 = new DecToBin();
        r2.DecToBin();
}

}
