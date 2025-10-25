//Greatest of two numbers
import java.util.Scanner;
public class greatestNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a= sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
            if(a>b){
                System.out.println("a is greater number");
            }
            else if (b>a){
                System.out.println("b is greater number");
            }
            else {
                System.out.println("equal numbers");
            }
        sc.close();
    }
}

