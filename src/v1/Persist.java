package v1;

class Persist {
    public static int persistence(long n) {
        long multiply;

        while (n > 9) {
            multiply = 1;

            while (n != 0) {
                multiply *= (n % 10);
                n /= 10;
            }

            n = multiply;
        }

        return (int) n;
    }

    public static void main(String[] args) {
        System.out.println(persistence(39));
    }
}