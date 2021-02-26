import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double ans = 0;
        double pi = Math.PI;
        Integer[] r = new Integer[n];
        for (int i = 0; i < n; i++) {
            r[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(r, Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            ans += (i % 2 == 0 ? 1 : -1) * pi * Math.pow(r[i], 2);
        }
        System.out.println(ans);
        br.close();
    }
}