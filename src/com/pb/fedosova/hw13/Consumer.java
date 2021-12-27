package com.pb.fedosova.hw13;

import java.util.ArrayList;
import java.util.Random;

public class Consumer implements Runnable {
    Random random = new Random();
    final int maxDelay;
    final ArrayList<Integer> list;

    public Consumer(ArrayList<Integer> list, int maxDelay) {
        this.list = list;
        this.maxDelay = maxDelay;
    }

    public void consume() {
        synchronized (list) {
            while (list.isEmpty()) {
                System.out.println("Список пуст, потребление невозможно");
                try {
                    System.out.println("Потребитель ожидает");
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Integer firstElement = list.get(0);
            System.out.println("Потребляется: " + firstElement);
            list.remove(firstElement);
            System.out.println("Полный список: " + list);
            list.notifyAll();
        }
    }

    @Override
    public void run() {
        System.out.println("Потребитель начал работать");
        while (true) {
            consume();
            try {
                int delay = random.nextInt(maxDelay);
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}