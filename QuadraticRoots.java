// Finding Roots of a quadratic equation
import java.util.Scanner;
public class QuadraticRoots {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficient a : ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b : ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c : ");
        double c = sc.nextDouble();
        double discriminant = b*b-4*a*c;
        System.out.println("\nThe quadratic equation is: " + a + "x² + " + b + "x + " + c + " = 0");
        if(discriminant>0){
            double root1 = (-b + Math.sqrt(discriminant))/(2*a);
            double root2 = (-b - Math.sqrt(discriminant))/(2*a);
            System.out.println("Root are real and different.");
            System.out.println("root1 = "+root1);
            System.out.println("root2 = "+root2);
        } else if(discriminant == 0){
            double root = (-b /(2*a));
            System.out.println("Roots are real and equal.");
            System.out.println("root1 - root2 = "+ root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex and different.");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
        sc.close();
    }
}
