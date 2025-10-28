//Quadrants in which a given coordinate lies
import java.util.Scanner;
public class Quadrants {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X cordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter Y cordinate: ");
        int y = sc.nextInt();

        if(x>0 && y>0){
            System.out.println("point is in Quadrant 1.");
        } else if(x>0 && y<0){
            System.out.println("point is in Quadrant 2.");
        } else if(x<0 && y<0){
            System.out.println("point is in Quadrant 3.");
        } else if(x<0 && y>0){
            System.out.println("point is in Quadrant 4.");
        } else if(x==0 && y==0){
            System.out.println("point is at origin.");
        } else if(x==0){
            System.out.println("point is on y axis.");
        } else if(y==0){
            System.out.println("point is on x axis.");
        }

        sc.close();
    } 
}