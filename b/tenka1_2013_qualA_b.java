import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i=0; i < n; i++) {
            String line = br.readLine();
            int sum = Arrays.stream(line.split(" "))
                            .mapToInt(Integer::parseInt)
                            .sum();
            if (sum < 20) ans++;
        }
        System.out.println(ans);
    }
}