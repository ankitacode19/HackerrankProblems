import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr2[i] = sc.nextInt();
        }

        int scoreA = 0;
        int scoreB = 0;
        for (int i = 0; i < 3; i++) {
            if (arr1[i] > arr2[i]) {
                scoreA++;

            } else if (arr2[i] > arr1[i]) {
                scoreB++;
            }

        }
        System.out.println(scoreA + " " + scoreB);
        sc.close();
    }
}