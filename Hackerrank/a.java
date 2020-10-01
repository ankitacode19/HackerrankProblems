import java.util.*;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 0; t < test; t++) {
            int n = sc.nextInt();
            String name[] = new String[n];
            char arr[] = new char[n];

            for (int i = 0; i < n; i++) {
                name[i] = sc.next();
                arr[i] = sc.next().charAt(0);
            }

            // for a
            int nayanvalue = 0;
            for (int i = 1; i < n; i++) {
                if (name[i].equals("nayan")) {
                    if (arr[i] == '+') {
                        nayanvalue = 1;
                    } else {
                        nayanvalue = -1;
                    }
                }
            }
            // for b
            int uditvalue = 0;
            for (int i = 1; i < n; i++) {
                if (name[i].equals("udit")) {
                    if (arr[i] == '+') {
                        uditvalue = 1;
                    } else {
                        uditvalue = -1;
                    }
                }
            }
            // for c
            int vyomvalue = 0;
            for (int i = 1; i < n; i++) {
                if (name[i].equals("vyom")) {
                    if (arr[i] == '+') {
                        vyomvalue = 1;
                    } else {
                        vyomvalue = -1;
                    }
                }
            }
            int ans = nayanvalue + vyomvalue + uditvalue;
            System.out.println(ans);
        }
    }
}
