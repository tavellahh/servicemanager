package ar.com.bpba.muleservicemanager.getBuild;

import java.util.ArrayList;

public class RetentionRule{
    public ArrayList<String> branches;
    public ArrayList<String> artifacts;
    public int daysToKeep;
    public int minimumToKeep;
    public boolean deleteBuildRecord;
    public boolean deleteTestResults;

    public ArrayList<String> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<String> branches) {
        this.branches = branches;
    }

    public ArrayList<String> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(ArrayList<String> artifacts) {
        this.artifacts = artifacts;
    }

    public int getDaysToKeep() {
        return daysToKeep;
    }

    public void setDaysToKeep(int daysToKeep) {
        this.daysToKeep = daysToKeep;
    }

    public int getMinimumToKeep() {
        return minimumToKeep;
    }

    public void setMinimumToKeep(int minimumToKeep) {
        this.minimumToKeep = minimumToKeep;
    }

    public boolean isDeleteBuildRecord() {
        return deleteBuildRecord;
    }

    public void setDeleteBuildRecord(boolean deleteBuildRecord) {
        this.deleteBuildRecord = deleteBuildRecord;
    }

    public boolean isDeleteTestResults() {
        return deleteTestResults;
    }

    public void setDeleteTestResults(boolean deleteTestResults) {
        this.deleteTestResults = deleteTestResults;
    }
}