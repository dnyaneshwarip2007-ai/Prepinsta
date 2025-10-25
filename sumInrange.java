//Sum of numbers in a given range
import java.util.Scanner;
public class sumInrange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Staring number : ");
        int startingNum = sc.nextInt();
        System.out.println("Ending number :");
        int endingNum = sc.nextInt();
        int sum=0;
        for (int i=startingNum; i<=endingNum; i++){
            sum = sum+i;
        }
        System.out.println(sum);
        sc.close();
    }
}
