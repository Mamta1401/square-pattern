// import java.util.*;
// public class ryt_ang_tri {

// public static Scanner scn = new Scanner(System.in);

// public static void ryt_tri(int n){
//     int nst = 1;              //nst = number of stars
//     for(int row = 1; row <= n; row++){
//         for(int cst = 1; cst <= nst; cst++){     // cst = count of stars
//             System.out.print("*");
//         }         
//         System.out.println("\t");
//         nst++; 
//     }
// }

// public static void main(String[] args){
//     ryt_tri(scn.nextInt());
//     }
// }




import java.util.*;

public class ryt_ang_tri {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // write ur code here
        
        int nst = 1;
        
        for(int row = 1; row <= n; row++){
            for(int cst = 1; cst <= nst; cst++){
                System.out.print("*\t");
            }
            nst++;
            System.out.println();
        }

    }
}
