import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        boolean[] indices = {false, false, false};
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I' || s.charAt(i) == 'i') {
                indices[0] = true;
            }
            if (indices[0] && (s.charAt(i) == 'C' || s.charAt(i) == 'c')) {
                indices[1] = true;
            }
            if ((indices[0] && indices[1]) && (s.charAt(i) == 'T' || s.charAt(i) == 't')) {
                indices[2] = true;
            }
        }
        String ans = (indices[0] && indices[1] && indices[2]) ? "YES" : "NO";
        System.out.println(ans);
    }
}