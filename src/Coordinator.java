
public class Coordinator implements Runnable {

    @Override
    public void run() {
        Runnable printerA = new PrintRunnable("A   .", 100);
        Thread threadA = new Thread(printerA);
        threadA.start();

        Runnable printerB = new PrintRunnable(".   B", 99);
        Thread threadB = new Thread(printerB);
        threadB.start();

        try {
            threadA.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("-----");
        Runnable printerC = new PrintRunnable("  C", 100);
        Thread threadC = new Thread(printerC);
        threadC.start();
        try {
            threadC.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-----");
    }
}