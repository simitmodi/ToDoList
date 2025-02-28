

public class Task {
    private String title;
    private String description;
    private boolean isCompleted;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.isCompleted = false;
    }

    // Getters and setters
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public boolean isCompleted() { return isCompleted; }
    public void setCompleted(boolean completed) { isCompleted = completed; }

    @Override
    public String toString() {
        return (isCompleted ? "[X] " : "[ ] ") + title + ": " + description;
    }
}