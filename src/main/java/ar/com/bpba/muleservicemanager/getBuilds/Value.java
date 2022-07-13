package ar.com.bpba.muleservicemanager.getBuilds;
public class Value{
    public String quality;
    public AuthoredBy authoredBy;
    public Queue queue;
    public String uri;
    public String type;
    public int revision;
    public int id;
    public String name;
    public String url;
    public Project project;

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public AuthoredBy getAuthoredBy() {
        return authoredBy;
    }

    public void setAuthoredBy(AuthoredBy authoredBy) {
        this.authoredBy = authoredBy;
    }

    public Queue getQueue() {
        return queue;
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return name;
    }
    
}