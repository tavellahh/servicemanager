package ar.com.bpba.muleservicemanager.getdetallerelease;

import java.util.ArrayList;

public class Environment{
    public int id;
    public String name;
    public int rank;
    public Owner owner;
    public Variables variables;
    public PreDeployApprovals preDeployApprovals;
    public DeployStep deployStep;
    public PostDeployApprovals postDeployApprovals;
    public int queueId;
    public RunOptions runOptions;
    public ArrayList<Object> demands;
    public ArrayList<Object> conditions;
    public ExecutionPolicy executionPolicy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Variables getVariables() {
        return variables;
    }

    public void setVariables(Variables variables) {
        this.variables = variables;
    }

    public PreDeployApprovals getPreDeployApprovals() {
        return preDeployApprovals;
    }

    public void setPreDeployApprovals(PreDeployApprovals preDeployApprovals) {
        this.preDeployApprovals = preDeployApprovals;
    }

    public DeployStep getDeployStep() {
        return deployStep;
    }

    public void setDeployStep(DeployStep deployStep) {
        this.deployStep = deployStep;
    }

    public PostDeployApprovals getPostDeployApprovals() {
        return postDeployApprovals;
    }

    public void setPostDeployApprovals(PostDeployApprovals postDeployApprovals) {
        this.postDeployApprovals = postDeployApprovals;
    }

    public int getQueueId() {
        return queueId;
    }

    public void setQueueId(int queueId) {
        this.queueId = queueId;
    }

    public RunOptions getRunOptions() {
        return runOptions;
    }

    public void setRunOptions(RunOptions runOptions) {
        this.runOptions = runOptions;
    }

    public ArrayList<Object> getDemands() {
        return demands;
    }

    public void setDemands(ArrayList<Object> demands) {
        this.demands = demands;
    }

    public ArrayList<Object> getConditions() {
        return conditions;
    }

    public void setConditions(ArrayList<Object> conditions) {
        this.conditions = conditions;
    }

    public ExecutionPolicy getExecutionPolicy() {
        return executionPolicy;
    }

    public void setExecutionPolicy(ExecutionPolicy executionPolicy) {
        this.executionPolicy = executionPolicy;
    }
    
}