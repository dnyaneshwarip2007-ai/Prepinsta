//Octal to Binary conversion
import java.util.Scanner;
public class OctalToBinary {
    public static String octalToBinary(int digit){
        switch (digit) {
            case 0: return "000";
            case 1: return "001";
            case 2: return "010";
            case 3: return "011";
            case 4: return "100";
            case 5: return "101";
            case 6: return "110";
            case 7: return "111";
            default: return ""; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        String octal = sc.next();

        String binary = "";

        for (int i = 0; i < octal.length(); i++) {
            int digit = octal.charAt(i) - '0';
            binary += octalToBinary(digit);
        }

        System.out.println("Binary number: " + binary);
        sc.close();
    }
}
