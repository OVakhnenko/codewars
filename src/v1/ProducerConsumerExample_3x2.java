package v1;

public class ProducerConsumerExample_3x2 {
    public static void main(String[] args) {
        SingleElementBuffer buffer = new SingleElementBuffer();
        Thread[] producers = new Thread[]{
                new Thread(new Producer(1, 950, buffer)),
                new Thread(new Producer(100, 1550, buffer)),
                new Thread(new Producer(1000, 2010, buffer)),
        };
        for (Thread producer : producers) {
            producer.start();
        }
        Thread[] consumers = new Thread[]{
                new Thread(new Consumer(buffer)),
                new Thread(new Consumer(buffer)),
        };
        for (Thread consumer : consumers) {
            consumer.start();
        }
    }
}