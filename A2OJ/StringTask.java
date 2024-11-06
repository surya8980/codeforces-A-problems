/*Petya started to attend programming lessons. On the first lesson his task was to write a simple program.
 The program was supposed to do the following: in the given string, consisting if uppercase and lowercase Latin letters, it:

--deletes all the vowels,
--inserts a character "." before each consonant,
--replaces all uppercase consonants with corresponding lowercase ones.
Vowels are letters "A", "O", "Y", "E", "U", "I", and the rest are consonants. The program's input is exactly one string,
 it should return the output as a single string, resulting after the program's processing the initial string.

Help Petya cope with this easy task.

Input
The first line represents input string of Petya's program. This string only consists of uppercase and lowercase Latin letters and its length is from 1 to 100, inclusive.

Output
Print the resulting string. It is guaranteed that this string is not empty. */

import java.util.Scanner;
import java.util.*;
public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> hm = new HashSet<>();
        hm.add('a');
        hm.add('e');
        hm.add('i');
        hm.add('o');
        hm.add('u');
        hm.add('y');
        hm.add('A');
        hm.add('E');
        hm.add('I');
        hm.add('O');
        hm.add('U');
        hm.add('Y');
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(hm.contains(c))continue;
            else{
                if(c>='A'&&c<='Z'){
                    sb.append('.');
                    sb.append(Character.toLowerCase(c));
                }else{
                    sb.append('.');
                    sb.append(c);
                }
            }
        }
        sc.close();
        System.out.println(sb.toString());
    }
}
