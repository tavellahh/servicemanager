package ar.com.bpba.muleservicemanager.getdetallerelease;

import java.util.ArrayList;

public class PreDeployApprovals{
    public ArrayList<Approval> approvals;
    public ApprovalOptions approvalOptions;

    public ArrayList<Approval> getApprovals() {
        return approvals;
    }

    public void setApprovals(ArrayList<Approval> approvals) {
        this.approvals = approvals;
    }

    public ApprovalOptions getApprovalOptions() {
        return approvalOptions;
    }

    public void setApprovalOptions(ApprovalOptions approvalOptions) {
        this.approvalOptions = approvalOptions;
    }
    
}