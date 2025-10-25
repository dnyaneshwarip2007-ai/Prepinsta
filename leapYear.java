//Leap year or not
import java.util.Scanner;
public class leapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year :");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("Year is leap");
        }
        else{
            System.out.println("Not a leap year");
        }
        sc.close();
    }
}
