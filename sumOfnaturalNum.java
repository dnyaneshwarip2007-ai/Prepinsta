//Sum of First N Natural numbers
import java.util.Scanner;
public class sumOfnaturalNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number n: ");
        int n = sc.nextInt();

        int sum =(n*(n+1))/2;
        System.out.println(sum);
        sc.close();
    }
}
