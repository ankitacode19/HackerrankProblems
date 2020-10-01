import java.util.*;
import java.util.Arrays;

class Solution {
    public static int factorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int noOfPairs = factorial(n - m);

        int a[][] = new int[noOfPairs][2];
        for (int i = 0; i < m - n - 1; i++) {
            for (int j = i + 1; j < m - n; j++) {
                a[i][0] = i + n;
                a[i][1] = j + n;
            }
        }

        for (int i = 0; i < noOfPairs; i++) {
            a[i][0] = a[i][0] ^ a[i][1];
        }
        int max = a[0][0];
        for (int i = 0; i < noOfPairs; i++) {
            if (a[i][0] > max) {
                max = a[i][0];
            }
        }
        System.out.println(max);

        sc.close();
    }
}
