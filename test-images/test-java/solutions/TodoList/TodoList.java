public class TodoList {
    private Task[] tasks;
    private int capacity;
    private int count;

    public TodoList(int capacity) {
        this.capacity = capacity;
        this.tasks = new Task[capacity];
        this.count = 0;
    }

    public void addTask(String description) {
        if (count < capacity) {
            tasks[count] = new Task(description);
            count++;
        } else {
            System.out.println("TodoList is full. Cannot add more tasks.");
        }
    }

    public void setStatus(int index, TaskStatus status) {
        if (index >= 0 && index < count) {
            tasks[index].setStatus(status);
        } else {
            System.out.println("Invalid index. Cannot set status.");
        }
    }

    public void setDescription(int index, String newDescription) {
        if (index >= 0 && index < count) {
            tasks[index].setDescription(newDescription);
        } else {
            System.out.println("Invalid index. Cannot set description.");
        }
    }

    public void displayTasks() {
        System.out.println("Tasks:");
        for (int i = 0; i < count; i++) {
            String res = String.format("%-34s| %s", tasks[i].getDescription(), tasks[i].getStatus());
            System.out.println(res);
        }
    }
}
