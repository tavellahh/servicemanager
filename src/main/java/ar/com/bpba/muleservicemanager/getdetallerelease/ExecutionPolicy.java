package ar.com.bpba.muleservicemanager.getdetallerelease;
public class ExecutionPolicy{
    public int concurrencyCount;
    public int queueDepthCount;

    public int getConcurrencyCount() {
        return concurrencyCount;
    }

    public void setConcurrencyCount(int concurrencyCount) {
        this.concurrencyCount = concurrencyCount;
    }

    public int getQueueDepthCount() {
        return queueDepthCount;
    }

    public void setQueueDepthCount(int queueDepthCount) {
        this.queueDepthCount = queueDepthCount;
    }
    
}