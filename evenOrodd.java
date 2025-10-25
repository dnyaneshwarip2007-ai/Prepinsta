//Even or Odd number
import java.util.Scanner;
public class evenOrodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter number: ");
            int number = sc.nextInt();

                if (number%2 ==0 ){
                    System.out.println("Even");
                }
                else if ( number%2!=0){
                    System.out.println("Odd");
                }
                
        sc.close();
    }
}
