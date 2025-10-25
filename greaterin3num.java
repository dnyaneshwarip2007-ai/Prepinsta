//Greatest of the Three numbers
import java.util.Scanner;
public class greaterin3num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b,c :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a>b)&& (a>c)){
            System.out.println("a greater number");
        }
        else if((b>a)&&(b>c)){
            System.out.println("b greater number");
        }
        else{
            System.out.println("c is greater number");
        }
        sc.close();
    }
}
