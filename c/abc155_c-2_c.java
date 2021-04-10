import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> hmap = new HashMap<>();

        IntStream.range(0, n).forEach(
            i -> hmap.compute(sc.next(), (k, v) -> v == null ? 1 : v+1)  // 第一引数をkeyとしてマップを検索、そのkeyと取得したvalueを使ってvalueを更新（削除）する
        );
        int maxValue = hmap.values().stream().max(Integer::compareTo).get();
        hmap.keySet().stream()
            .filter(k -> hmap.get(k) == maxValue)
            .sorted()
            .forEach(System.out::println);
    }
}