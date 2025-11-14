//Finding Number of times x digit occurs in a given input 
import java.util.Scanner;
public class CountDigitOccurrence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        System.out.print("Enter the digit to count : ");
        int x = sc.nextInt();

        int count =0;
        long n = Math.abs(num);

        while(n>0){
            long digit = n%10;
            if(digit==x){
                count++;
            }
            n=n/10;
        }
        System.out.println("Digit " + x + " occurs " + count + " times in " + num);
        sc.close();
    }
}
