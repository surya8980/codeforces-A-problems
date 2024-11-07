import java.util.Scanner;

public class PetrPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); 
        int a = scanner.nextInt(); 
        int b = scanner.nextInt();
        int result = Math.min( n-a, b+1 );
        
        System.out.println(result);
        scanner.close();
    }
}
