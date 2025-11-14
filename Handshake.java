//Maximum number of handshakes
import java.util.Scanner;
public class Handshake {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        int handshake;
        handshake= (n*(n-1))/2;
        System.out.println(handshake);
        sc.close();
    }
}
