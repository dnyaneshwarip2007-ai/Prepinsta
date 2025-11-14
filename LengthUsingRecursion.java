// Program to calculate length of the string using recursion-
import java.util.Scanner;
public class LengthUsingRecursion {
    public static int getLength(String str){
        if(str.length()==0) {
            return 0;
        }
        return 1+ getLength(str.substring(1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.next();
        int length = getLength(str);
        System.out.println("Length of the string: " + length);
        sc.close();
    }
}
