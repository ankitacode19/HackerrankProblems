
import java.util.*;
import java.util.Arrays;

class Solution {
    public static String insertCharacterInBetween(String str, char cr, int index) {
        /*
         * !here the str is original String, !cr is the character to be inserted and
         * !index is the index at which we need to insert the character
         */
        str = str.substring(0, index) + cr + str.substring(index + 1);// modified string
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
}