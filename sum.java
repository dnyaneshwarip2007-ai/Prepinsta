//Sum of N natural numbers
import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("n:");
        int n = sc.nextInt();
        System.out.println("Starting number : ");
        int startingNum = sc.nextInt();

        int sum =0;

        for(int i=0; i<n; i++){
            sum = sum+(startingNum+i);
        }
        System.out.println(sum);
        sc.close();
    }
   
}
