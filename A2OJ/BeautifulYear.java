/*It seems like the year of 2013 came only yesterday. 
Do you know a curious fact? The year of 2013 is the first year after the old 1987 with only distinct digits.

Now you are suggested to solve the following problem: 
given a year number, find the minimum year number which is strictly larger than the given one and has only distinct digits.

Input
The single line contains integer y (1000 ≤ y ≤ 9000) — the year number.

Output
Print a single integer — the minimum year number that is strictly larger than y and all it's digits are distinct. 
It is guaranteed that the answer exists. */

import java.util.HashSet;
import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int nextYear = y + 1;
        while (true) {
            if (hasDistinctDigits(nextYear)) {
                System.out.println(nextYear);
                break; 
            }
            nextYear++;
        }
    }
    
    private static boolean hasDistinctDigits(int year) {
        HashSet<Character> digitSet = new HashSet<>();
        String yearString = Integer.toString(year);
        
        for (char digit : yearString.toCharArray()) {
            if (!digitSet.add(digit)) {
                return false; 
            }
        }
        return true; 
    }
}
