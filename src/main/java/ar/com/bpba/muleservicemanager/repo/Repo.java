package ar.com.bpba.muleservicemanager.repo;

import ar.com.bpba.muleservicemanager.repo.Project;

public class Repo{
    public String name;
    public Project project;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    
    
}
