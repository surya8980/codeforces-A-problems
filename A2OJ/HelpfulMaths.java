/*Xenia the beginner mathematician is a third year student at elementary school. She is now learning the addition operation.

The teacher has written down the sum of multiple numbers. Pupils should calculate the sum. To make the calculation easier, 
the sum only contains numbers 1, 2 and 3. Still, that isn't enough for Xenia. She is only beginning to count, so she can calculate a sum only if the summands follow in non-decreasing order. 
For example, she can't calculate sum 1+3+2+1 but she can calculate sums 1+1+2 and 3+3.

You've got the sum that was written on the board. Rearrange the summans and print the sum in such a way that Xenia can calculate the sum.

Input
The first line contains a non-empty string s — the sum Xenia needs to count. String s contains no spaces. It only contains digits and characters "+". 
Besides, string s is a correct sum of numbers 1, 2 and 3. String s is at most 100 characters long.

Output
Print the new sum that Xenia can count. */

import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='1')count1++;
            else if(c=='2')count2++;
            else if(c=='3')count3++;
        }
        StringBuilder sb = new StringBuilder();
        while(count1>0){
            sb.append('1');
            count1--;
            if(count1>0||count2>0||count3>0)sb.append('+');
        }
        while(count2>0){
            sb.append('2');
            count2--;
            if(count2>0||count3>0)sb.append('+');
        }
        while(count3>0){
            sb.append('3');
            count3--;
            if(count3>0)sb.append('+');
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
