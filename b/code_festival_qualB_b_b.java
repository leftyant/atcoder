import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int sum = 0;
        int ans = 0;
        for (int i=0; i < n; i++) {
            sum += Integer.parseInt(sc.next());
            if (sum >= k) {
                ans = i + 1;
                break;
            }
        }
        System.out.println(ans);
        
    }
}