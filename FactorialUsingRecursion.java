import java.util.Scanner;
public class FactorialUsingRecursion {
    static int factorial(int num){
        int result =1;
        for(int i=1; i<=num; i++){
            result = result*i;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int result = factorial( num);
        System.out.println("Factorial of the number is : "+ result);
        sc.close();
    }
}
