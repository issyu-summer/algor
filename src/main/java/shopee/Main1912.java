package shopee;

import java.util.*;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1912 {

    public static void main(String[] args) {
        int[][] ar = new int[3][3];
        ar[0]=new int[]{
               60,1625,2383
        };
        ar[1]=new int[]{
                54,6691,9511
        };
        ar[2]=new int[]{
                39,1625,6066
        };

        MovieRentingSystem ms = new MovieRentingSystem(3, ar);

        ms.rent(60,1625);
        ms.rent(54,6691);
        ms.rent(39,1625);
        System.out.println(ms.report());
    }
}
