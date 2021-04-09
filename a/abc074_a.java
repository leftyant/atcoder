import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        for (int i=0; i < 15; i++) {
            arr.add(sc.next());
        }
        Collections.sort(arr);
        System.out.println(arr.get(6));
    }
}