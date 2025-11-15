//            3
//            44
//            555
//            6666
// Basic incrementing Triangle Pattern(Inverted) 

public class IncrementTri {
    public static void main(String[] args){
        int n = 4;
        for(int i =1; i<=n; i++){
            for(int j =1; j<=i; j++){
                if(i==1){
                    System.out.print("3");
                }
                else if (i==2){
                    System.out.print("4");
                }
                else if (i==3){
                    System.out.print("5");
                }
                else {
                    System.out.print("6");
                }
            }
            System.out.println();
        }
    }
}
