
/*Vasya has recently learned to type and log on to the Internet.
 He immediately entered a chat room and decided to say hello to everybody. 
 Vasya typed the word s. It is considered that Vasya managed to say hello if several letters can be deleted from the typed word 
 so that it resulted in the word "hello". For example, if Vasya types the word "ahhellllloou", 
 it will be considered that he said hello, and if he types "hlelo", it will be considered that Vasya got misunderstood and he didn't manage to say hello. 
 Determine whether Vasya managed to say hello by the given word s.

Input
The first and only line contains the word s, which Vasya typed. This word consisits of small Latin letters, 
its length is no less that 1 and no more than 100 letters.

Output
If Vasya managed to say hello, print "YES", otherwise print "NO". */
import java.util.Scanner;

public class ChatRoom {
    public static String issub(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == t.length())
            return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // we have a string we needt to find whether "hello" is subsequence of it or not
        String s = sc.nextLine();
        String t = "hello";
        String ans = issub(s, t);
        System.out.println(ans);
        sc.close();
    }
}
