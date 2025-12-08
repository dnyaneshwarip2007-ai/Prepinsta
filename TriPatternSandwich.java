//             2
//             34
//             567
//             891011
//             891011
//             567
//             34
//             2
// Basic double incrementing Triangle Pattern initialised Sandwich= 3

public class TriPatternSandwich {
    public static void main(String[] args) {

        int start = 2;
        int rows = 4;
        int sandwich = 1;

        int current = start;

        // store row starts
        int[] rowStart = new int[rows + 1];

        // Upper part
        for (int i = 1; i <= rows; i++) {
            rowStart[i] = current;  // store start of each row

            for (int j = 1; j <= i; j++) {
                System.out.print(current);
                current++;
            }
            System.out.println();
        }

        // Middle repeated row (Sandwich)
        for (int s = 0; s < sandwich; s++) {
            int temp = rowStart[rows];
            for (int j = 1; j <= rows; j++) {
                System.out.print(temp);
                temp++;
            }
            System.out.println();
        }

        // Lower mirrored part
        for (int i = rows - 1; i >= 1; i--) {
            int temp = rowStart[i];
            for (int j = 1; j <= i; j++) {
                System.out.print(temp);
                temp++;
            }
            System.out.println();
        }
    }
}