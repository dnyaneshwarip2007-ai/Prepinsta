public class RotateArray {
    static void reverse(int[] arr, int start, int end){
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rotateRight(int[] arr, int k){
        int n = arr.length;
        //Adjust k if it's greater than array size
        k = k % n;
        //Step 1: Reverse whole array
        reverse(arr, 0, n-1);
        //step 2: Reverse first k elements
        reverse(arr, 0, k-1);
        //step 3: Reverse remaining elements
        reverse(arr, k, n-1);
    }
    static void rotateLeft(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, k-1);
        reverse(arr, 0, n-1);
        reverse(arr, k , n-1);

    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rotateRight(arr, k);
        rotateLeft(arr, k);

        System.out.println("Array after right rotation: ");
        for(int num: arr){
            System.out.print(num+" ");
        }

        System.out.println("Array after left rotation: ");
        for(int num: arr){
            System.out.print(num+" ");
        }

    }
}
