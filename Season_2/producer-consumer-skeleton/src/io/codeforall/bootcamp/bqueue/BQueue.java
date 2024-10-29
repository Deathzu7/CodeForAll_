package io.codeforall.bootcamp.bqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Blocking Queue
 * @param <T> the type of elements stored by this queue
 */
public class BQueue<T> {

        private int limit;
        private final Queue<T> queue = new LinkedList<T>();
    /**
     * Constructs a new queue with a maximum size
     * @param limit the queue size
     */
    public BQueue(int limit) {
        this.limit = limit;
    }

    /**
     * Inserts the specified element into the queue
     * Blocking operation if the queue is full
     * @param data the data to add to the queue
     */
    public void offer(T data) {
        synchronized (this){
            while (this.getSize() == this.limit  ) {
                try {
                    System.out.println(Thread.currentThread().getName() + " tried to produce a pizza but the queue is full");

                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " produced a pizza");
                this.queue.add(data);
                notifyAll();
            System.out.println("QUEUE SIZE : " + this.queue.size());

        }
        }



    /**
     * Retrieves and removes data from the head of the queue
     * Blocking operation if the queue is empty
     * @return the data from the head of the queue
     */
    public T poll() {
            synchronized (this){
                while (this.getSize() == 0){
                    try {
                        System.out.println(Thread.currentThread().getName() + " tried to consume a pizza but the queue is empty");

                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " consumed a pizza");

                T data = this.queue.remove();
                System.out.println("QUEUE SIZE : " + this.queue.size());
                notifyAll();
                return data;
            }
    }

    /**
     * Gets the number of elements in the queue
     * @return the number of elements
     */
    public int getSize() {

        return this.queue.size();
    }

    /**
     * Gets the maximum number of elements that can be present in the queue
     * @return the maximum number of elements
     */
    public int getLimit() {

        return this.limit;
    }

}
