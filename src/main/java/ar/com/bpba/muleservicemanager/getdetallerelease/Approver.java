package ar.com.bpba.muleservicemanager.getdetallerelease;
public class Approver{
    public String id;
    public String displayName;
    public boolean isContainer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public boolean isIsContainer() {
        return isContainer;
    }

    public void setIsContainer(boolean isContainer) {
        this.isContainer = isContainer;
    }
    
}