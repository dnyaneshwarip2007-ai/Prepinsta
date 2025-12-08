//            2
//            33
//            444
//            5555
//            5555
//            444
//            33
//            2
// Basic incrementing Diamond Pattern(Inverted Sandwich) initialised = 3

public class InvertedSandwich {
    public static void main(String[] args){
        int n =4;
        for(int i=1; i<=n; i++){
            for(int j =1; j<=i; j++){
                if(i==1){
                    System.out.print("2");
                } else if(i==2){
                    System.out.print("3");
                } else if(i==3){
                    System.out.print("4");
                } else{
                    System.out.print("5");
                }
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j =1; j<=i; j++){
                if(i==1){
                    System.out.print("2");
                } else if(i==2){
                    System.out.print("3");
                } else if(i==3){
                    System.out.print("4");
                } else{
                    System.out.print("5");
                }
            }
            System.out.println();
        }
    }
}
