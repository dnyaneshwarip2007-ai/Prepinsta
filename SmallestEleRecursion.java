// Smallest element in an array
import java.util.Scanner;
public class SmallestEleRecursion {
    public static int findSmallest(int arr[] , int n){
        if (n == 1)
            return arr[0];
        int min = findSmallest(arr , n-1);
        if(arr[n-1]< min)
            return arr[n-1];
        else
            return min;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter elements: ");
        for(int i =0; i<n; i++)
            arr[i] = sc.nextInt();
        int smallest = findSmallest(arr, n);
        System.out.println("Smallest element is: "+smallest);
        sc.close();
    }
}
