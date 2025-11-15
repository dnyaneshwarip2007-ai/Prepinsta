//            3
//            44
//            555
//            6666
//            555
//            44
//            3
// Basic incrementing Diamond Pattern(Inverted) initialised = 3

public class incrementDiamond {
    public static void main(String[] args){
        int n =4;
        int num =3;
        for (int i =1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(num+i-1);
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j =1; j<=i; j++){
                System.out.print(num+i-1);
            }
            System.out.println();
        }
    }
}
