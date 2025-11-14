//            ****
//             ****
//              ****
//               ****
// Rhombus Star Pattern
import java.util.Scanner;

public class RhombusStarPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =4;
        for(int i=1; i<=n; i++){
            for (int s =1; s<=(n-i); s++){
                System.out.print(" ");
            }
            for(int j =1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
