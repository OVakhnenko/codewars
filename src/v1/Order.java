package v1;

public class Order {
    public static String order(String words) {
        String[] awords = words.split(" ");
        String[] result = new String[awords.length];

        if (words.isEmpty())
            return "";

        for (String word : awords) {
            for (int i = 0; i < 10; i++) {
                if (word.indexOf((char) (i + 48 + 1)) != -1) {
                    result[i] = word;
                    break;
                }
            }
        }

        return String.join(" ", result);
    }

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
}
