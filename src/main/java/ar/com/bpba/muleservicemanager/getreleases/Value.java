package ar.com.bpba.muleservicemanager.getreleases;

import java.util.Date;

public class Value{
    public int id;
    public int revision;
    public String name;
    public CreatedBy createdBy;
    public Date createdOn;
    public ModifiedBy modifiedBy;
    public Date modifiedOn;
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
     @Override
    public String toString() {
        return name;
    }
    
}