public class Rabbit {

    static class RabbitPrinter implements Runnable {
        public void run() {
            for (int i = 0; i < 2; i++) {
                Runnable rp = new RabbitPrinter();
                Thread thread = new Thread(rp);
                System.out.println("New rabbit born! " + thread.getName());
                thread.start();

                try {
                    thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new RabbitPrinter()).start();
    }
}
