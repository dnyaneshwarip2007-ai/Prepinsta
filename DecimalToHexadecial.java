//Decimal to Hexadecimal Conversion
import java.util.Scanner;
public class DecimalToHexadecial {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a decimal number: ");
    int num = sc.nextInt();
    String hexadecimal ="";

     while (num > 0) {
            int remainder = num % 16;
            hexadecimal = remainder + hexadecimal;
            num /= 16;
        }
    
        System.out.println("Hexadecimal: "+ hexadecimal);
    sc.close();
   } 
}
