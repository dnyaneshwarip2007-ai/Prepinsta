//            *******
//             *   *
//              * *
//               *
// Inverted Hollow Pyramid Star Pattern

public class InvertedHollowPyramid {
    public static void main(String[] args){
        int n=4;
        for(int i=n; i>=1; i--){
            for(int s=1; s<=(n-i); s++){
                System.out.print(" ");
            }
            for( int j =1; j<=(2*i-1); j++){
                if (j==1 || j==(2*i-1) || i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
