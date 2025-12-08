// 3 
// 45 
// 678 
// 9101112 
// 678 
// 45 
// 3 
// Basic double incrementing Triangle Pattern initialised = 3

public class doubleIncrementTriPatt {
     public static void main(String[] args) {
        int start = 3;
        int current = start;
        int rows = 4; 

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(current);
                current++;
            }
            System.out.println();
        }

        current = start+(1+2);

        for (int i = rows - 1; i >= 1; i--) {
            int temp = current;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp);
                temp++;
            }
            System.out.println();
            current -=  (i-1) ;
        }
    }
}
