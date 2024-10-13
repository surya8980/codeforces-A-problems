/*You are given all numbers between 1,2,\ldots,n except one. 
Your task is to find the missing number.
Input
The first input line contains an integer n.
The second line contains n-1 numbers.
Each number is distinct and between 1 and n (inclusive).
Output
Print the missing number.
Constraints

2 \le n \le 2 \cdot 10^5

Example
Input:
5
2 3 1 5

Output:
4 */
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long [] arr= new long[(int)n-1];
        long sum=0;
        for(int k=0;k<n-1;k++){
            arr[k]=sc.nextLong();
            sum+=arr[k];
        }
        long real = (n*(n+1))/2;
        System.out.println(real-sum);
        sc.close();
    }
}
