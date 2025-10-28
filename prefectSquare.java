//Perfect Square
import java.util.Scanner;
public class prefectSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nuber:");
        int num = sc.nextInt();
        
        boolean isPerfectSquare = false;
        for(int i=1; i<=num; i++){
            if(i*i==num){
                isPerfectSquare = true;
                break;
            }
        }

        if(isPerfectSquare){
            System.out.println(num+" is perfect square number");
        }
        else{
            System.out.println(num+" is not perfect square number");
        }
        sc.close();
    }
}
