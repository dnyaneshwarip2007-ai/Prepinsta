//Sum of digits of a number
import java.util.Scanner;
public class sumOfdigits {
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in); 
    System.out.println("enter number:");
    int number = sc.nextInt();
    int sum=0;
    while(number>0){
        int lastDigit= number%10;
        number = number/10;
        sum= sum+lastDigit;
    }
    System.out.println(sum);
    sc.close();
   }
}
