//            13*14*15*16
//            9*10*11*12
//            5*6*7*8
//            1*2*3*4
// Basic incrementing inverted Squared Number-Star Pattern

public class InvertedSquNumPatt {
     public static void main(String[] args) {
        int n = 4;                  // size of square
        int total = n * n;          // last number = 16

        for (int i = 0; i < n; i++) {
            int start = total - (i * n); // start number of each row

            for (int j = 0; j < n; j++) {
                System.out.print(start + j);
                if (j < n - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
