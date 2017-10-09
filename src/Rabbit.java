public class Rabbit {

    class RabbitPrinter implements Runnable {
        public void run() {
            System.out.println("New rabbit born!");
        ...
            while (...){
                new Thread().start(new RabbitPrinter());
            ....
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new RabbitPrinter()).start();
    }
}
