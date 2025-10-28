//Hexadecimal to Decimal conversion
import java.util.Scanner;
public class HexadecimaltoDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal: ");
        int Hexadecimal = sc.nextInt();

        int decimal =0;
        int power=0;
        while(Hexadecimal>0){
            int lastDigit = Hexadecimal % 10;
            decimal += lastDigit * Math.pow(16, power);
            Hexadecimal /= 10;
            power++;
        }
        System.out.println("Decimal: "+ decimal);
        sc.close();
    }
}
