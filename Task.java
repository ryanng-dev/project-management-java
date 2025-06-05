public class Task {

    private int taskId;
    private String description;
    private boolean completed;
    private char taskType;
    private int taskDuration;

    // Getters
    public int getTaskId() {
        return taskId;
    }
    public String getDescription() {
        return description;
    }
    public boolean isCompleted() {
        return completed;
    }
    public char getTaskType() {
        return taskType;
    }
    
    public int getTaskDuration(){
        return taskDuration;
    }
    
    // Setters
    
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
    public void setTaskDescription(String description){
        this.description = description;
    }
    public void completed(boolean completed){
        this.completed= completed;
    } 
    public void setTaskType(char taskType) {
        this.taskType = taskType;
    }
    public void setTaskDuration(int taskDuration){
        this.taskDuration = taskDuration;
    }  

    public Task(int taskId, String description, boolean completed, Tasktype tasktype, int taskDuration) {
        this.task = taskId;
        this.description = description;
        this.completed = completed;
        this.tasktype = tasktype;
        this.taskDuration = taskDuration;
    }
}