package by.trofimov.producer_consumer.service;

import static by.trofimov.producer_consumer.util.Constant.*;

public class Market {

    private int breadCount;

    public synchronized void getBread() {
        while(breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println(THE_CUSTOMER_BUYS_BREAD);
        System.out.println(BREAD_LEFT_ON_THE_COUNTER + breadCount);
        notify();
    }

    public synchronized void putBread() {
        while(breadCount >= MAX_BREAD_COUNT) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println(THE_PRODUCER_PUTS_BREAD);
        System.out.println(BREAD_LEFT_ON_THE_COUNTER + breadCount);
        notify();
    }

}
