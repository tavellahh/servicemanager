package ar.com.bpba.muleservicemanager.crearBuild;
public class Task{
    public String id;
    public String versionSpec;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVersionSpec() {
        return versionSpec;
    }

    public void setVersionSpec(String versionSpec) {
        this.versionSpec = versionSpec;
    }
}