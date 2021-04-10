import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<String, String> hmap = new HashMap<>();
        String[] f = {"O", "D", "I", "Z", "S", "B"};
        String[] t = {"0", "0", "1", "2", "5", "8"};
        for (int i=0; i < f.length; i++) {
            hmap.put(f[i], t[i]);
        }
        String ans = "";
        for (String si: s.split("")) {
            if (hmap.containsKey(si)) {
                ans += hmap.get(si);
            } else {
                ans += si;
            }
        }
        System.out.println(ans);
    }
}