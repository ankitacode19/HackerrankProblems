import java.io.*;
import java.util.*;

import javax.swing.plaf.synth.SynthGraphicsUtils;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        {
            String add = A + B;
            System.out.println(add.length());
        }

        int com = A.compareTo(B);
        if (com < 0) {
            System.out.println("No");
        } else if (com > 0) {
            System.out.println("Yes");

        } else if (com == 0) {
            System.out.println("No");
        }

        String up1 = A.substring(0, 1).toUpperCase();
        String up2 = B.substring(0, 1).toUpperCase();

        A = up1.concat(A.substring(1, A.length()));
        A = A.concat(" ");
        B = up2.concat(B.substring(1, B.length()));

        A = A.concat(B);
        System.out.println(A);
        sc.close();
    }

}
