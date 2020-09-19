import java.util.*;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x < 38) {
                System.out.println(x);
            } else {
                int lastdigit = x % 10;

                if (lastdigit == 3 || lastdigit == 8) {
                    x += 2;
                } else if (lastdigit == 4 || lastdigit == 9) {
                    x += 1;
                }
            }
            System.out.println(x);

        }
        sc.close();
    }
}