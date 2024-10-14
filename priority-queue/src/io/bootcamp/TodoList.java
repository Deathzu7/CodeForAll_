package io.bootcamp;
import java.util.PriorityQueue;

public class TodoList {

    private PriorityQueue<Task> priorityQueue;
    public Importance importance;

    public TodoList() {
        this.priorityQueue = new PriorityQueue<>();
    }

    public boolean add(Importance importance, int priority, String description) {
        return priorityQueue.add(new Task(importance, priority, description));
    }

    public boolean isEmpty() {
        return priorityQueue.isEmpty();

    }

    public String remove() {
        return this.priorityQueue.remove().getDescription();
    }
}

