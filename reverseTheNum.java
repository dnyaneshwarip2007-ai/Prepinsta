//Reverse of a number 
import java.util.Scanner;
public class reverseTheNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number= sc.nextInt();
        int answer=0;
        while(number>0){
            int lastDigit = number%10;
            answer = answer*10+lastDigit;
            number= number/10;
        }
        System.out.println(answer);
        sc.close();
    }
}
