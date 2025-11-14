// Sort the elements of an array
import java.util.Arrays;
public class sortingArray {
    public static void main(String[] args){
        int[] arr = {45, 2, 89, 6, 1, 76};
        Arrays.sort(arr);
        System.out.println("Sorted array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
