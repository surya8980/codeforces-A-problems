/*Little Petya loves presents. His mum bought him two strings of the same size for his birthday.
The strings consist of uppercase and lowercase Latin letters. Now Petya wants to compare those two strings lexicographically. 
The letters' case does not matter, that is an uppercase letter is considered equivalent to the corresponding lowercase letter. 
Help Petya perform the comparison.

Input
Each of the first two lines contains a bought string. The strings' lengths range from 1 to 100 inclusive. 
It is guaranteed that the strings are of the same length and also consist of uppercase and lowercase Latin letters.

Output
If the first string is less than the second one, print "-1". If the second string is less than the first one, print "1". 
If the strings are equal, print "0". Note that the letters' case is not taken into consideration when the strings are compared. */

import java.util.Scanner;

public class PetyaAndStrings {
    public static int compareStrings(String string1, String string2) {
        if (string1.compareTo(string2) > 0) {
            return 1;
        }
        else if (string1.compareTo(string2) == 0) {
            return 0;
        }
        else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(compareStrings(s1.toLowerCase(),s2.toLowerCase()));
        sc.close();
    }
}
