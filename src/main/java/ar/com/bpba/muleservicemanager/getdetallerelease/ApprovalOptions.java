package ar.com.bpba.muleservicemanager.getdetallerelease;
public class ApprovalOptions{
    public Object requiredApproverCount;
    public boolean releaseCreatorCanBeApprover;

    public Object getRequiredApproverCount() {
        return requiredApproverCount;
    }

    public void setRequiredApproverCount(Object requiredApproverCount) {
        this.requiredApproverCount = requiredApproverCount;
    }

    public boolean isReleaseCreatorCanBeApprover() {
        return releaseCreatorCanBeApprover;
    }

    public void setReleaseCreatorCanBeApprover(boolean releaseCreatorCanBeApprover) {
        this.releaseCreatorCanBeApprover = releaseCreatorCanBeApprover;
    }
    
}