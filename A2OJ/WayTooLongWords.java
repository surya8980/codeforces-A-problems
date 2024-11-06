import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String s = sc.nextLine();
            int length = s.length();
            String sb = "";
            if(length<=10) sb+=s;
            else{
                sb+=s.charAt(0);
                sb+=Integer.toString(length-2);
                sb+=s.charAt(length-1);
            }
            System.out.println(sb);
        }
        
    }
}
