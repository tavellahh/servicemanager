package ar.com.bpba.muleservicemanager.crearBuild;
public class Build{
    public boolean enabled;
    public boolean continueOnError;
    public boolean alwaysRun;
    public String displayName;
    public Task task;
    public Inputs inputs;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isContinueOnError() {
        return continueOnError;
    }

    public void setContinueOnError(boolean continueOnError) {
        this.continueOnError = continueOnError;
    }

    public boolean isAlwaysRun() {
        return alwaysRun;
    }

    public void setAlwaysRun(boolean alwaysRun) {
        this.alwaysRun = alwaysRun;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Inputs getInputs() {
        return inputs;
    }

    public void setInputs(Inputs inputs) {
        this.inputs = inputs;
    }
}