import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int palindromeIndex(String s) {
        boolean ansinit = palindromeString(s);
        if (ansinit == true) {
            return -1;
        } else {

            int ans = 0;
            for (int i = 0; i < s.length(); i++) {
                String temp = s;
                char cr = "".charAt(0); // character to replace
                int index = i;
                temp = temp.substring(0, index) + cr + temp.substring(index + 1);// modified string`
                if (palindromeString(temp) == true) {
                    return i;
                }
            }
            return -1;

        }

    }

    public static boolean palindromeString(String s) {

        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        String reversedString = sb.toString();

        if (reversedString.equals(s)) {
            return true;
        } else {
            return false;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
