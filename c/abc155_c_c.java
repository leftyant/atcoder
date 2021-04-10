import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> hmap = new TreeMap<>();  // キーを自動でソート
        int max = 0;
        for (int i=0; i < n; i++) {
            String si = sc.next();
            if (hmap.containsKey(si)) {
                hmap.put(si, hmap.get(si)+1);
            } else {
                hmap.put(si, 1);
            }
            max = Math.max(max, hmap.getOrDefault(si, 0));
        }
        for (String k: hmap.keySet()) {
            if (hmap.get(k) == max) {
                System.out.println(k);
            }
        } 
    }
}