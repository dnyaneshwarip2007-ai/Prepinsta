//Octal to Decimal conversion

import java.util.Scanner;
public class OctalToDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a octal number: ");
        int octal= sc.nextInt();

        int decimal = 0;
        int power = 0;

        while (octal > 0) {
            int lastDigit = octal % 10;
            decimal += lastDigit * Math.pow(8, power);
            octal /= 10;
            power++;
        }
        System.out.println("Decimal number: "+ decimal);
        sc.close();
    }
}
