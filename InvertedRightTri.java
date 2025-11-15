//            10987
//            456
//            32
//            1
// Basic Right Triangle Number Pattern (Inverted)

public class InvertedRightTri {
    public static void main(String[] args){
        int n = 4;
        int num = 10;
        for(int i = n; i>=1; i--){
            for(int j =1; j<=i; j++){
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
    }
}
