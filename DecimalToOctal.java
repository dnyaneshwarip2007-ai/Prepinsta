//Decimal to Octal Conversion
import java.util.Scanner;
public class DecimalToOctal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int num = sc.nextInt();
        String octal="";

        while (num > 0) {
            int remainder = num % 8;
            octal = remainder + octal;
            num /= 8;
        }

        System.out.println("Octal: "+octal);
        sc.close();
    }
}
