import java.io.Serializable;

public class Task implements Serializable {
    private static final long serialVersionUID = 1L;
    private String title;
    private String description;
    private boolean isCompleted;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.isCompleted = false;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public boolean isCompleted() { return isCompleted; }
    public void setCompleted(boolean completed) { isCompleted = completed; }

    @Override
    public String toString() {
        return (isCompleted ? "[X] " : "[ ] ") + title + ": " + description;
    }
}