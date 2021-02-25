import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = nums[0];
        int a = nums[1];
        int b = nums[2];
        boolean isAntTurn = false;
        while (n > 0) {
            isAntTurn = !isAntTurn;
            if (isAntTurn) {
                n -= a;
            } else {
                n -= b;
            }
        }
        System.out.println(isAntTurn ? "Ant" : "Bug");
        br.close();
    }
}