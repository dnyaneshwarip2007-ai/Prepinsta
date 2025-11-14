public class sumofeleinArray {
    public static void main(String[] args){
        int[] arr = { 1,4,3,7,9 };
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum= sum+arr[i];
        }
        System.out.println("Sum of elements in array is : "+sum);
    }
}
