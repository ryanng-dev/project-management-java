public class Project {
    private int projectId;
    private String projectName;
    private Task[] task;
    private String projectType;
    
    public void taskManager() {
        task = new Task[3];
    }
    public int getProjectId() {
        return projectId;
    }
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getProjectType() {
        return projectType;
    }
    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }
    public Task[] getTask(){
        return task;
    }
    public void setTask(int index,Task t){
        if (index >=0 && index<task.length){
            task[index]=t;
        }
    }
}
