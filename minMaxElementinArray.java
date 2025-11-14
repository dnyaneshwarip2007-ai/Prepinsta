// Find the Smallest and largest element in an array
import java.util.Arrays;
public class minMaxElementinArray {
    public static void main(String[] args){
        int[] arr = { 10, 25, 3, 55,8 };
        Arrays.sort(arr);
        System.out.println("Smallest element: "+arr[0]);
        System.out.println("Largest element : "+ arr[arr.length-1]);
    }
}
