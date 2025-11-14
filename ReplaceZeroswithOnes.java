// Replace all 0’s with 1 in a given integer
import java.util.Scanner;
public class ReplaceZeroswithOnes {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int result = replaceZeros(num);
        System.out.println("Number after replacing all 0's with 1's: "+ result);
        sc.close();
    }
    static int replaceZeros(int num) {
        if(num==0)
            return 1;

        int result = 0, place = 1;

        while (num>0) {
            int digit = num%10;
            if(digit==0)
                digit = 1;

            result += digit * place;
            place *= 10;
            num /= 10;
        }
        return result;
    }
}
