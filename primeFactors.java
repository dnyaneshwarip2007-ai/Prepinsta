//Finding Prime Factors of a number 
import java.util.Scanner;
public class primeFactors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
            int number= sc.nextInt();
            System.out.println("Prime Factors are: ");
            for(int i=1; i<=number; i++){
                if(number%i==0){
                     System.out.println(i); 
                }
            }
        sc.close();
    }
}

//INCOMPLETE CODE 
