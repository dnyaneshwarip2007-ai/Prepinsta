// Given a string s, remove all its adjacent duplicate characters recursively
import java.util.Scanner;
public class removeDuplicatesUsingREcursion{
    static String removeDuplicates(String s){
        if(s.length() <= 1){
            return s;
        }
        if(s.charAt(0) == s.charAt(1)){
            return removeDuplicates(s.substring(1));
        }
        return s.charAt(0)+ removeDuplicates(s.substring(1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s= sc.nextLine();
        String result = removeDuplicates(s);
        System.out.println("Original: "+s);
        System.out.println("After removing adjacent Duplicates: "+ result);
        sc.close();
    }
}