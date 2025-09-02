import java.util.ArrayList;
import java.util.List;

public class TodoList {

    List<Task> tasks;

    TodoList() {
        this.tasks = new ArrayList<Task>();
    }

    public void addTask(Task task) {
        task.modifyDescription(task.description);
        for (Task t : this.tasks) {
            if (t.identifier == task.identifier) {
                throw new IllegalArgumentException("Task with identifier %d already exists in the list",task.identifier);
            }
        }
        tasks.add(task);

    }

    public boolean markTaskDone(int identifier) {
        for (Task t : this.tasks) {
            if (t.identifier == identifier) {
                t.isDone = true;
                return true;
            }
        }
        return false;
    }

    public boolean undoTask(int identifier) {
        for (Task t : this.tasks) {
            if (t.identifier == identifier) {
                t.isDone = false;
            }
            return false;
        }
        return true;
    }

    public void undoAll() {
        for (Task t : this.tasks) {
            t.isDone = false;
        }
    }

    public void completeAll() {
        for (Task t : this.tasks) {
            t.isDone = true;
        }
    }

    public void listTasks() {
        for (Task t : this.tasks) {
            System.out.printf(t.isDone ? "[X]  Id: %d - Description: %s\n" : "[ ]  Id: %d - Description: %s\n", t.identifier, t.description);
        }
    }


}
