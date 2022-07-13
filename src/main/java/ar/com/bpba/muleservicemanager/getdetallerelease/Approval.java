package ar.com.bpba.muleservicemanager.getdetallerelease;
public class Approval{
    public int rank;
    public boolean isAutomated;
    public boolean isNotificationOn;
    public Approver approver;
    public int id;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean isIsAutomated() {
        return isAutomated;
    }

    public void setIsAutomated(boolean isAutomated) {
        this.isAutomated = isAutomated;
    }

    public boolean isIsNotificationOn() {
        return isNotificationOn;
    }

    public void setIsNotificationOn(boolean isNotificationOn) {
        this.isNotificationOn = isNotificationOn;
    }

    public Approver getApprover() {
        return approver;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
