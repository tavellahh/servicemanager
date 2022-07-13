package ar.com.bpba.muleservicemanager.getdetallerelease;

import java.util.ArrayList;

public class DeployStep{
    public ArrayList<Task> tasks;
    public int id;

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}