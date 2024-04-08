package by.trofimov.producer_consumer;

import by.trofimov.producer_consumer.service.*;

public class Runner {

    public static void main(String[] args) {

        final Market market = new Market();
        final Producer producer = new Producer(market);
        final Consumer consumer = new Consumer(market);

        Thread producerThread = new Thread(producer);
        Thread counsumerThread = new Thread(consumer);
        producerThread.start();
        counsumerThread.start();

    }

}
