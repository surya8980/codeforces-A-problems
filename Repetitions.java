/*You are given a DNA sequence: a string consisting of characters A, C, G, and T.
 Your task is to find the longest repetition in the sequence. 
 This is a maximum-length substring containing only one type of character.
Input
The only input line contains a string of n characters.
Output
Print one integer: the length of the longest repetition.
Constraints

1 \le n \le 10^6

Example
Input:
ATTCGGGA

Output:
3 */

import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int maxlen = 1;
        int len = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                len++;
            else {
                maxlen = Math.max(len, maxlen);
                len = 1;
            }
        }
        maxlen = Math.max(len, maxlen);// for last seq
        System.out.println(maxlen);
        sc.close();
    }
}
