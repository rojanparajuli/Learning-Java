import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class CreateTask {
    String title;
    boolean completed;

    CreateTask(String title) {
        this.title = title;
        this.completed = false;
    }
}

 class Todo {

    static List<CreateTask> tasks = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- TODO MENU ---");
            System.out.println("1. Add Task");
            System.out.println("2. Complete Task");
            System.out.println("3. Show Pending Tasks");
            System.out.println("4. Remove Completed Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
    case 1: {
        addTask();
        break;
    }
    case 2: {
        completeTask();
        break;
    }
    case 3: {
        showPendingTasks();
        break;
    }
    case 4: {
        removeCompletedTasks();
        break;
    }
    case 5: {
        System.out.println("Goodbye");
        sc.close();
        return;
    }
    default: {
        System.out.println("Invalid choice!");
        break;
    }
}

        }
    }

    static void addTask() {
        System.out.print("Enter task title: ");
        String title = sc.nextLine();
        tasks.add(new CreateTask(title));
        System.out.println("Task added");
    }

    static void completeTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available!");
            return;
        }

        for (int i = 0; i < tasks.size(); i++) {
            CreateTask t = tasks.get(i);
            System.out.println(i + ". " + t.title + " [" + (t.completed ? "Done" : "Pending") + "]");
        }

        System.out.print("Enter task index: ");
        int index = sc.nextInt();

        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).completed = true;
            System.out.println("Task marked as completed ✔");
        } else {
            System.out.println("Invalid index!");
        }
    }

    static void removeCompletedTasks() {
        tasks.removeIf(task -> task.completed);
        System.out.println("Completed tasks removed");
    }

    static void showPendingTasks() {
        System.out.println("\nPending Tasks:");
        tasks.stream()
             .filter(task -> !task.completed)
             .forEach(task -> System.out.println("- " + task.title));
    }
}
