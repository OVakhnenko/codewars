public class Rabbit {

    static class RabbitPrinter implements Runnable {
        public void run() {
            System.out.println("New rabbit born!");
            new Thread(new RabbitPrinter()).start();
            System.out.println("New rabbit born!");
            new Thread(new RabbitPrinter()).start();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new RabbitPrinter()).start();
    }
}
