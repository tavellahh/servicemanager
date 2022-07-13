package ar.com.bpba.muleservicemanager.getdetallerelease;
public class RunOptions{
    public String environmentOwnerEmailNotificationType;
    public String skipArtifactsDownload;
    public String timeoutInMinutes;

    public String getEnvironmentOwnerEmailNotificationType() {
        return environmentOwnerEmailNotificationType;
    }

    public void setEnvironmentOwnerEmailNotificationType(String environmentOwnerEmailNotificationType) {
        this.environmentOwnerEmailNotificationType = environmentOwnerEmailNotificationType;
    }

    public String getSkipArtifactsDownload() {
        return skipArtifactsDownload;
    }

    public void setSkipArtifactsDownload(String skipArtifactsDownload) {
        this.skipArtifactsDownload = skipArtifactsDownload;
    }

    public String getTimeoutInMinutes() {
        return timeoutInMinutes;
    }

    public void setTimeoutInMinutes(String timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }
    
}