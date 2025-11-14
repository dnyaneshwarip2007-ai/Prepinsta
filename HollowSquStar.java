//            ****
//            *  *
//            *  *
//            ****
// Hollow Square Star Pattern
import java.util.Scanner;
public class HollowSquStar {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =4;
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                if(i==0 || i==n-1 || j==0 || j== n-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
