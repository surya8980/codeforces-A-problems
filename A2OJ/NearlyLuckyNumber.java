/*Petya loves lucky numbers. 
We all know that lucky numbers are the positive integers whose decimal representations contain only the lucky digits 4 and 7. 
For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.

Unfortunately, not all numbers are lucky. Petya calls a number nearly lucky if the number of lucky digits in it is a lucky number. 
He wonders whether number n is a nearly lucky number.

Input
The only line contains an integer n (1 ≤ n ≤ 1018).

Please do not use the %lld specificator to read or write 64-bit numbers in С++.
 It is preferred to use the cin, cout streams or the %I64d specificator.

Output
Print on the single line "YES" if n is a nearly lucky number. Otherwise, print "NO" (without the quotes). */
import java.util.Scanner;
public class NearlyLuckyNumber {
    private static boolean isLuckyNumber(long count) {
        String countStr = Long.toString(count);
        for (char c : countStr.toCharArray()) {
            if (c != '4' && c != '7') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine(); 
        scanner.close();
        
        int luckyDigitCount = 0;
        for (char c : n.toCharArray()) {
            if (c == '4' || c == '7') {
                luckyDigitCount++;
            }
        }
        if (isLuckyNumber(luckyDigitCount)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
