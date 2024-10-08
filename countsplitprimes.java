/*Given a string **S** consisting of digits [0-9], count the number of ways this string can be split into continuous substrings
 such that each substring is a prime number. Each digit must be in one substring and the entire string must be used.

**Note:**
The input string does not contain leading zeros.
Each number split of the given number must be in the range `2 to 1e6` inclusive.
Since the answer can be large, return the answer modulo `1e9+7`.


**Constraints**
1 <= | S | <= 1e5

**Example**
_input_
11373
_output_
6
_Explanation_
[11, 3, 7, 3], [11, 3, 73], [11, 37, 3], [113, 7, 3], [113, 73], [11, 373]. */

// Java program to Find all the 
// ways to split the given string 
// into Primes. 
import java.util.*;

public class countsplitprimes {
    // efficiently detecting the prime using pre computed array till 1000001
    static boolean[] primes = new boolean[1000001];
    static int maxn = 1000000;

    // using Sieve of Eratosthenes fill the primes array
    static void sieve() {
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i * i <= maxn; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= maxn; j += i)
                    primes[j] = false;
            }
        }
    }

    // Function Convert integer
    // to binary string
    static String toBinary(int n) {
        String r = "";

        while (n != 0) {
            r = (n % 2 == 0 ? "0" : "1") + r;
            n /= 2;
        }
        return (r == "") ? "0" : r;
    }

    // Function print all the
    // ways to split the given string
    // into Primes.
    static void PrimeSplit(String str) {
        String temp;
        int cnt = 0;

        // To store all possible strings
        ArrayList<String> ans = new ArrayList<>();
        int bt = 1 << (str.length() - 1);
        int n = str.length();

        // Exponetnital complexity n*(2^(n-1))
        // for bit
        for (int i = 0; i < bt; i++) {
            temp = toBinary(i) + "0";
            int j = 0, x = n - temp.length(), y;

            while (j < x) {
                temp = "0" + temp;
                j++;
            }
            j = 0;
            x = 0;
            y = -1;

            String sp = "", tp = "";
            boolean flag = false;

            while (j < n) {
                sp += str.charAt(j);

                if (temp.charAt(j) == '1') {
                    tp += sp + ',';
                    y = Integer.parseInt(sp);

                    // Pruning step
                    if (!primes[y]) {
                        flag = true;
                        break;
                    }
                    sp = "";
                }
                j++;
            }
            tp += sp;

            if (sp != "") {
                y = Integer.parseInt(sp);

                if (!primes[y])
                    flag = true;
            }
            if (!flag)
                ans.add(tp);
        }

        if (ans.size() == 0) {
            System.out.println(-1);
        }

        for (String i : ans) {
            System.out.println(i);
        }
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sieve();

        PrimeSplit(str);
        sc.close();
    }
}
