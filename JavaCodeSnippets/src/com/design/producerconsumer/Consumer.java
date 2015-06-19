package com.design.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    private final BlockingQueue<Integer> sharedQueue;

    public Consumer (BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
  
    @Override
    public void run() {
        while(true){
            try {
                System.out.println("Consumed: "+ sharedQueue.take());
            } catch (InterruptedException ex) {
            	ex.printStackTrace();
               // Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
  
  
}
