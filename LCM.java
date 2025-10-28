import java.util.Scanner;

public class LCM {
     public static int findHCF(int a, int b) {
        while(a != b) {
            if(a > b) {
                a = a - b;
            } else {
                b = a;
            }
        }
        return a; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int hcf = findHCF(num1, num2);
        int lcm = (num1 * num2) / hcf;

        System.out.println("LCM: " + lcm);
        sc.close();
    }
}
