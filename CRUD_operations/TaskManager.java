import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Create a new task");
            System.out.println("2. Read and display tasks");
            System.out.println("3. Update task details");
            System.out.println("4. Delete a task");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createTask();
                    break;
                case 2:
                    displayTasks();
                    break;
                case 3:
                    updateTask();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createTask() {
        System.out.print("Enter task name: ");
        String name = scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        Task newTask = new Task(name, description);
        tasks.add(newTask);
        System.out.println("Task created successfully.");
    }

    private static void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                System.out.println("Task " + (i + 1) + ": " + task.getName() + " - " + task.getDescription());
            }
        }
    }

    private static void updateTask() {
        displayTasks();
        System.out.print("Enter the task number to update: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            Task task = tasks.get(taskNumber - 1);
            System.out.print("Enter new description: ");
            String newDescription = scanner.nextLine();
            task.setDescription(newDescription);
            System.out.println("Task details updated successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void deleteTask() {
        displayTasks();
        System.out.print("Enter the task number to delete: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
