import java.util.Scanner;

public class ArmstronginRange {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start value: ");
        int start = sc.nextInt();

        System.out.print("Enter end value: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            int original = num;
            int temp = num;
            int result = 0;

            while (temp > 0) {
                int digit = temp % 10;
                result += digit * digit * digit;
                temp = temp / 10;
            }

            if (result == original) {
                System.out.print(original + " ");
            }
        }
        sc.close();
    }
}
