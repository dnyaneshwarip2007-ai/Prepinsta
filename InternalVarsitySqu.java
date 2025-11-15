//            333
//            313
//            323
//            333
// Internal varsity square Pattern

public class InternalVarsitySqu {
    public static void main(String[] args){
        int n = 4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=3; j++){
                if(i==1 || i==n || j==1 || j==3){
                    System.out.print("3");
                }
                else {
                    if(i == 2 && j == 2){
                        System.out.print("1");
                    } else if(i == 3 && j == 2){
                        System.out.print("2");
                    } else {
                        System.out.print("3");
                    }
                }
            }
            System.out.println();
        }
    }
}
