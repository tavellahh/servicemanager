package ar.com.bpba.muleservicemanager.getdetallerelease;
public class Inputs{
    public String sourceFolder;
    public String contents;
    public String targetFolder;
    public String host;
    public String port;
    public String username;
    public String password;
    public String privatekey;
    public String cleanTargetFolder;
    public String failOnCleanError;
    public String overwrite;
    public String failOnEmptySource;
    public String flattenFolders;

    public String getSourceFolder() {
        return sourceFolder;
    }

    public void setSourceFolder(String sourceFolder) {
        this.sourceFolder = sourceFolder;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getTargetFolder() {
        return targetFolder;
    }

    public void setTargetFolder(String targetFolder) {
        this.targetFolder = targetFolder;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrivatekey() {
        return privatekey;
    }

    public void setPrivatekey(String privatekey) {
        this.privatekey = privatekey;
    }

    public String getCleanTargetFolder() {
        return cleanTargetFolder;
    }

    public void setCleanTargetFolder(String cleanTargetFolder) {
        this.cleanTargetFolder = cleanTargetFolder;
    }

    public String getFailOnCleanError() {
        return failOnCleanError;
    }

    public void setFailOnCleanError(String failOnCleanError) {
        this.failOnCleanError = failOnCleanError;
    }

    public String getOverwrite() {
        return overwrite;
    }

    public void setOverwrite(String overwrite) {
        this.overwrite = overwrite;
    }

    public String getFailOnEmptySource() {
        return failOnEmptySource;
    }

    public void setFailOnEmptySource(String failOnEmptySource) {
        this.failOnEmptySource = failOnEmptySource;
    }

    public String getFlattenFolders() {
        return flattenFolders;
    }

    public void setFlattenFolders(String flattenFolders) {
        this.flattenFolders = flattenFolders;
    }
    
}