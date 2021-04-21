import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                if ((i == s.length() - 1) || !Character.isDigit((s.charAt(i + 1)))) {
                    System.out.println(s.charAt(i));
                } else if (Character.isDigit(s.charAt(i + 1))) {
                    System.out.println(s.substring(i, i + 2));
                }
                System.exit(0);
            }
        }
    }
}