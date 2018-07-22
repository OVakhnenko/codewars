package v1;

public class Threadz {
    public static void main(String[] args) throws InterruptedException {
        for (int k = 0; k < 10; k++) {
            Coordinator coordinator = new Coordinator();
            Thread threadCoordinator = new Thread(coordinator);
            threadCoordinator.start();
            threadCoordinator.join();
        }
    }
}
