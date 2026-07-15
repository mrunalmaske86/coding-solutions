import java.util.*;

public class Solution {

    public static List<Integer> reverseArray(List<Integer> a) {
        Collections.reverse(a);
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        List<Integer> result = reverseArray(arr);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
