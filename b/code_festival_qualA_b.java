import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int b = Integer.parseInt(br.readLine());
        char ans;
        if (b <= a.length()) {
            ans = a.charAt(b - 1);
        } else {
            int mod = b % a.length();
            ans = a.charAt(mod == 0 ? a.length() - 1 : mod - 1);
        }
        System.out.println(ans);
    }
}