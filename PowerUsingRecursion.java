//Code for recursion Power of a Number 

import java.util.Scanner;
public class PowerUsingRecursion {
    static int power(int base, int exponent){
        if(exponent == 0)
            return 1;
        else 
            return base*power(base, exponent - 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter base number:");
        int base = sc.nextInt();

        System.out.print("Enter exponent number: ");
        int exponent = sc.nextInt();

        int result = power(base, exponent);

        System.out.println(base + " raised to the power " + exponent + " is: " + result);
        sc.close();
    }
}