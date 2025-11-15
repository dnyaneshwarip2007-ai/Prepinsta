//            3
//            4 5
//            6 7 8
//            9 10 11 12
// Basic double incrementing Triangle Pattern initialised = 3

public class DoubleIncrementTri {
    public static void main(String[] args){
        int n =4;
        int num =3;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }
}
