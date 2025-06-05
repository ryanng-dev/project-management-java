import java.util.*;
public class UserInterface{
    
    private Project[] projects;
    private Scanner console;
    public void ProjectManager() {
        projects = new Project[10];
    }

    public Project[] getProjects() {
        return projects;
    }

    public void setProject(int index, Project project) {
       if (index >= 0 && index < projects.length) {
        projects[index] = project;
       }
    }
}