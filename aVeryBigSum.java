import java.util.*;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        long ar[] = new long[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextLong();
            sum = sum + ar[i];
        }
        System.out.println(sum);
        sc.close();
    }
}