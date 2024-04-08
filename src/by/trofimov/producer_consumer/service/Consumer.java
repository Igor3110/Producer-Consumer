package by.trofimov.producer_consumer.service;

public class Consumer implements Runnable {

    private final Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            market.getBread();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
