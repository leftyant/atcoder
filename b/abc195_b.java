import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int I(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] abw = Arrays.stream(br.readLine().split(" "))
                               .mapToInt(Integer::parseInt)
                               .toArray();
        int a = abw[0];
        int b = abw[1];
        int w = abw[2] * 1000;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i=1; i < 1_000_000+1; i++) {
            if (a*i <= w && w <= b*i) {
                max = Math.max(max, i);
                min = Math.min(min, i);
            }
        }
        if (max == 0) {
            System.out.println("UNSATISFIABLE");
        } else {
            System.out.printf("%d %d\n", min, max);
        }
    }
}