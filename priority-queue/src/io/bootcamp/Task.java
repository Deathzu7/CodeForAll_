package io.bootcamp;

public class Task implements Comparable<Task> {

    private Importance importance;
    private int priority;
    private String description;

    public Task(Importance toDoImportance, int priority, String description) {
        this.importance = toDoImportance;
        this.priority = priority;
        this.description = description;
    }

    public Importance getImportance() {
        return importance;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Task task) {
        if (this.importance == task.importance) {
            return this.priority - task.priority;
        }
        return this.importance.getImportance() - task.importance.getImportance();
    }
}