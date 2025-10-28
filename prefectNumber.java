//Perfect number
import java.util.Scanner;
public class prefectNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int sum=0;
        for(int i=1; i<number; i++){
            if(number%i==0){
                sum= sum+i;
            }
        }

        if(sum==number){
            System.out.println(number+ " is perfect number.");
        }
        else{
            System.out.println(number+ " is not perfect number.");
        }
        sc.close();
    }
}
