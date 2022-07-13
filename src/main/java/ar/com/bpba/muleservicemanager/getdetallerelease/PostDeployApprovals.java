package ar.com.bpba.muleservicemanager.getdetallerelease;

import java.util.ArrayList;

public class PostDeployApprovals{
    public ArrayList<Approval> approvals;

    public ArrayList<Approval> getApprovals() {
        return approvals;
    }

    public void setApprovals(ArrayList<Approval> approvals) {
        this.approvals = approvals;
    }
    
}