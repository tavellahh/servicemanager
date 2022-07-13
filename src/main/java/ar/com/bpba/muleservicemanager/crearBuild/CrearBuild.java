/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.bpba.muleservicemanager.crearBuild;

import java.util.ArrayList;

/**
 *
 * @author P046456
 */
public class CrearBuild {
    public String name;
    public String type;
    public String quality;
    public Queue queue;
    public ArrayList<Build> build;
    public ArrayList<Option> options;
    public ArrayList<Trigger> triggers;
    public Variables variables;
    public ArrayList<RetentionRule> retentionRules;
    public String buildNumberFormat;
    public String jobAuthorizationScope;
    public Repository repository;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public Queue getQueue() {
        return queue;
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }

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

    public Repository getRepository() {
        return repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}
