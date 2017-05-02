import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        int n;
        Scanner keyIn = new Scanner(System.in);
        while (keyIn.hasNext()) {
            n = keyIn.nextInt();
            System.out.println((3*Math.pow(n,2)-n+1));
        }
    }
}
