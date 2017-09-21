public class Groups {

    public static boolean groupCheck(String s) {
        boolean found;
        String result = s;
        String[] symbols = {"{}", "()", "[]"};

        do {
            found = false;

            for (String symbol : symbols) {
                if (result.indexOf(symbol) > -1) {
                    result = result.replace(symbol, "");
                    System.out.println(result);
                    found = true;
                }
            }
        } while (found);

        if (result.length() == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(groupCheck("([{()}])()(){}{}{}[][][][["));
    }
}