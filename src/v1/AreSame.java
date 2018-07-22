package v1;

import java.util.stream.IntStream;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {
        boolean result = false;

        if ((a == null) || (b == null) || (a.length != b.length))
            return result;

        for (int elenent : a) {
            result = IntStream.of(b).anyMatch(x -> x == elenent * elenent);
            if (!result) break;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(AreSame.comp(a, b));
    }
}