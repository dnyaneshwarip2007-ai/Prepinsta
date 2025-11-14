// HCF of two numbers using Recursion
import java.util.Scanner;
public class HCFRecursion {
    static int findHCF(int a, int b){
       if (b == 0)
            return a;
        return findHCF(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int hcf = findHCF(num1, num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        sc.close();
    }
}
