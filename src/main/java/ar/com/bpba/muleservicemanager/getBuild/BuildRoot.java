package ar.com.bpba.muleservicemanager.getBuild;

import java.util.ArrayList;
import java.util.Date;

public class BuildRoot{
    public ArrayList<Build> build;
    public ArrayList<Option> options;
    public ArrayList<Trigger> triggers;
    public Variables variables;
    public ArrayList<RetentionRule> retentionRules;
    public Links _links;
    public String buildNumberFormat;
    public String jobAuthorizationScope;
    public int jobTimeoutInMinutes;
    public Repository repository;
    public String quality;
    public AuthoredBy authoredBy;
    public Queue queue;
    public String uri;
    public String type;
    public int revision;
    public Date createdDate;
    public int id;
    public String name;
    public String url;
    public Project project;

    public ArrayList<Build> getBuild() {
        return build;
    }

    public void setBuild(ArrayList<Build> build) {
        this.build = build;
    }

    public ArrayList<Option> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<Option> options) {
        this.options = options;
    }

    public ArrayList<Trigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(ArrayList<Trigger> triggers) {
        this.triggers = triggers;
    }

    public Variables getVariables() {
        return variables;
    }

    public void setVariables(Variables variables) {
        this.variables = variables;
    }

    public ArrayList<RetentionRule> getRetentionRules() {
        return retentionRules;
    }

    public void setRetentionRules(ArrayList<RetentionRule> retentionRules) {
        this.retentionRules = retentionRules;
    }

    public Links getLinks() {
        return _links;
    }

    public void setLinks(Links _links) {
        this._links = _links;
    }

    public String getBuildNumberFormat() {
        return buildNumberFormat;
    }

    public void setBuildNumberFormat(String buildNumberFormat) {
        this.buildNumberFormat = buildNumberFormat;
    }

    public String getJobAuthorizationScope() {
        return jobAuthorizationScope;
    }

    public void setJobAuthorizationScope(String jobAuthorizationScope) {
        this.jobAuthorizationScope = jobAuthorizationScope;
    }

    public int getJobTimeoutInMinutes() {
        return jobTimeoutInMinutes;
    }

    public void setJobTimeoutInMinutes(int jobTimeoutInMinutes) {
        this.jobTimeoutInMinutes = jobTimeoutInMinutes;
    }

    public Repository getRepository() {
        return repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public AuthoredBy getAuthoredBy() {
        return authoredBy;
    }

    public void setAuthoredBy(AuthoredBy authoredBy) {
        this.authoredBy = authoredBy;
    }

    public Queue getQueue() {
        return queue;
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}