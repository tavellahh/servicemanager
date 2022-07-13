package ar.com.bpba.muleservicemanager.getBuild;

import java.util.ArrayList;

public class Trigger{
    public ArrayList<String> branchFilters;
    public boolean batchChanges;
    public int maxConcurrentBuildsPerBranch;
    public String triggerType;

    public ArrayList<String> getBranchFilters() {
        return branchFilters;
    }

    public void setBranchFilters(ArrayList<String> branchFilters) {
        this.branchFilters = branchFilters;
    }

    public boolean isBatchChanges() {
        return batchChanges;
    }

    public void setBatchChanges(boolean batchChanges) {
        this.batchChanges = batchChanges;
    }

    public int getMaxConcurrentBuildsPerBranch() {
        return maxConcurrentBuildsPerBranch;
    }

    public void setMaxConcurrentBuildsPerBranch(int maxConcurrentBuildsPerBranch) {
        this.maxConcurrentBuildsPerBranch = maxConcurrentBuildsPerBranch;
    }

    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }
}