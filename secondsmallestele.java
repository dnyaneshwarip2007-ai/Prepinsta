//Find Second Smallest Element in an Array
import java.util.Arrays;
public class secondsmallestele {
    public static void main(String[] args){
        int[] arr = {10,2,5,8,1};
        Arrays.sort(arr);
        System.out.println("Second smallest element : "+ arr[1]);
    }
}
