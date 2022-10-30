import java.util.*;

public class arrow {

    public static Scanner scn = new Scanner(System.in);

    public static void arrowPattern(int n) {
        int nsp = n / 2;
        int nst = 1;
        for (int row = 1; row <= n; row++) {
            for (int csp = 1; csp <= nsp; csp++) {
                if (row == (n / 2) + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }

            if (row <= n / 2) {
                nst++;
            } else {
                nst--;
            }
            System.out.println("\t");
        }
    }

    public static void main(String[] args) {
        arrowPattern(scn.nextInt());
    }
}
