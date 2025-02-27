import java.io.IOException;
import java.util.Scanner;

public class inputs {
    public static void main(String[] args) throws IOException {
        System.out.println("enter thr value ");
        int n1 = System.in.read(); // System.in.read() gives the ascii values 
        System.out.println(n1);

        Scanner scan = new Scanner(System.in);
        System.out.println("enter thr value n2 ");
        int n2 =  scan.nextInt();
        System.out.println(n2);
    }
}
