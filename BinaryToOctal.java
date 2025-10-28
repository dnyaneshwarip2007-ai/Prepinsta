//Binary to Octal conversion 
import java.util.Scanner;
public class BinaryToOctal {
    public static int binaryToDecimal(int binary){
        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            binary /= 10;
            power++;
        }
        return decimal;
    }
    public static String decimalToOctal(int decimal) {
        String octal="";

        while (decimal > 0) {
            int remainder = decimal % 8;
            octal = remainder + octal;
            decimal /= 8;
        }
        return octal;
    }

    public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();

        int decimal = binaryToDecimal(binary);
        String octal = decimalToOctal(decimal);

        System.out.println("Octal number: " + octal);
        sc.close();
    
    }
}
