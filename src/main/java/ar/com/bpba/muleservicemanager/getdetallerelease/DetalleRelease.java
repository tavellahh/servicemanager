package ar.com.bpba.muleservicemanager.getdetallerelease;

import java.util.ArrayList;
import java.util.Date;

public class DetalleRelease{
    public int id;
    public int revision;
    public String name;
    public CreatedBy createdBy;
    public Date createdOn;
    public ModifiedBy modifiedBy;
    public Date modifiedOn;
    public Variables variables;
    public ArrayList<Environment> environments;
    public ArrayList<Artifact> artifacts;
    public ArrayList<Object> triggers;
    public String releaseNameFormat;
    public RetentionPolicy retentionPolicy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreatedBy getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public ModifiedBy getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(ModifiedBy modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Variables getVariables() {
        return variables;
    }

    public void setVariables(Variables variables) {
        this.variables = variables;
    }

    public ArrayList<Environment> getEnvironments() {
        return environments;
    }

    public void setEnvironments(ArrayList<Environment> environments) {
        this.environments = environments;
    }

    public ArrayList<Artifact> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(ArrayList<Artifact> artifacts) {
        this.artifacts = artifacts;
    }

    public ArrayList<Object> getTriggers() {
        return triggers;
    }

    public void setTriggers(ArrayList<Object> triggers) {
        this.triggers = triggers;
    }

    public String getReleaseNameFormat() {
        return releaseNameFormat;
    }

    public void setReleaseNameFormat(String releaseNameFormat) {
        this.releaseNameFormat = releaseNameFormat;
    }

    public RetentionPolicy getRetentionPolicy() {
        return retentionPolicy;
    }

    public void setRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
    }
    
}