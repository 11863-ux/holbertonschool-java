package todo;

public class Task {
    String description;
    boolean isDone;
    int identifier;

    Task(String description, int identifier) {
        modifyDescription(description);
        this.identifier = identifier;
    }

    public boolean isDone() {
        return isDone;
    }

    public String getDescription() {
        return description;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void modifyDescription(String description){
        if(description==null || description.isEmpty()){
            throw new IllegalArgumentException("Invalid task description");
        } this.description=description;
    }
}
