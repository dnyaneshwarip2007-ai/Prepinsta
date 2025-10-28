//Power of a number
import java.util.Scanner;

public class powerOfnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter a base: ");
            int base= sc.nextInt();
            System.out.println("Enter a exponent:");
            int exponent = sc.nextInt();

            int result =1;
            for(int i=1; i<=exponent; i++){
                result = result*base;
            }
            System.out.println(result);

        sc.close();
    }
}
