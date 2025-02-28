

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;
    private static final String FILENAME = "tasks.dat";

    public ToDoList() {
        tasks = FileHandler.loadTasks(FILENAME); // Load tasks on startup
    }

    public void addTask(String title, String description) {
        tasks.add(new Task(title, description));
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found!");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void markTaskCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
        } else {
            System.out.println("Invalid task number!");
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid task number!");
        }
    }

    public void saveTasks() {
        FileHandler.saveTasks(tasks, FILENAME); // Save tasks before exit
    }
}