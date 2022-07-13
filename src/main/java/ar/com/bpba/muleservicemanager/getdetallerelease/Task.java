package ar.com.bpba.muleservicemanager.getdetallerelease;
public class Task{
    public String taskId;
    public String version;
    public String name;
    public boolean enabled;
    public boolean alwaysRun;
    public boolean continueOnError;
    public Inputs inputs;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isAlwaysRun() {
        return alwaysRun;
    }

    public void setAlwaysRun(boolean alwaysRun) {
        this.alwaysRun = alwaysRun;
    }

    public boolean isContinueOnError() {
        return continueOnError;
    }

    public void setContinueOnError(boolean continueOnError) {
        this.continueOnError = continueOnError;
    }

    public Inputs getInputs() {
        return inputs;
    }

    public void setInputs(Inputs inputs) {
        this.inputs = inputs;
    }
    
}