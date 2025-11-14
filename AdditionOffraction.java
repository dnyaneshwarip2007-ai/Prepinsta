//Addition of two fractions
import java.util.Scanner;
public class AdditionOffraction {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first numnetor: ");
        int a = sc.nextInt();
        System.out.print("Enter second numnetor: ");
        int c = sc.nextInt();
        System.out.print("Enter first denomnetor: ");
        int b = sc.nextInt();
        System.out.print("Enter second denomnetor: ");
        int d = sc.nextInt();
        sc.close();
        int resultNum = (a * d) + (b * c);
        int resultDen = b * d;

        int gcd = findGCD(resultNum, resultDen);
        resultNum /= gcd;
        resultDen /= gcd;

        System.out.println("Sum of fractions = " + resultNum + "/" + resultDen);
        sc.close();

    }
}
