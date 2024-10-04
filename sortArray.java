
/*is it possible to sort the array a (in increasing order) 
by reversing exactly one segment of a?
Input
The first line of the input contains an integer n (1 ≤ n ≤ 105) — the size of array a.

The second line contains n distinct space-separated integers: a[1], a[2], ..., a[n] (1 ≤ a[i] ≤ 109).

Output
Print "yes" or "no" (without quotes), depending on the answer.

If your answer is "yes", then also print two space-separated integers denoting start and end 
(start must not be greater than end) indices of the segment to be reversed.
 If there are multiple ways of selecting these indices, print any of them. */
import java.util.*;

public class sortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sortedArr = new int[n];
        for (int i = 0; i < n; i++) {
            sortedArr[i] = arr[i];
        }
        Arrays.sort(sortedArr);

        // Finding the first and last indices where arr differs from sortedArr
        int start = -1, end = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != sortedArr[i]) {
                if (start == -1) {
                    start = i;
                }
                end = i;
            }
        }

        if (start == -1) {
            System.out.println("yes");
            System.out.println("1 1");
        } else {
            reverseSegment(arr, start, end);
            if (isSorted(arr)) {
                // Indices are 1-based
                System.out.println("yes");
                System.out.println((start + 1) + " " + (end + 1));
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }

    // Function to reverse a segment of the array from start to end (inclusive)
    private static void reverseSegment(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to check if the array is sorted in increasing order
    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
