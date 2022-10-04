import java.util.*;

public class square {

    public static Scanner scn = new Scanner(System.in);

    public static void squarePattern(int n) {
        int nst = n;
        for (int row = 1; row <= n; row++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            System.out.println("\t");
        }
    }

    public static void main(String[] args) {
        squarePattern(scn.nextInt());
    }
}
