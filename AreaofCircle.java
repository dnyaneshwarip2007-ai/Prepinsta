//Calculate the area of a circle
import java.util.Scanner;
public class AreaofCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius :");
        float r = sc.nextFloat();
        double pi = 3.14;
        double area = pi*r*r;
        System.out.println(area);
        sc.close();
    }
}
