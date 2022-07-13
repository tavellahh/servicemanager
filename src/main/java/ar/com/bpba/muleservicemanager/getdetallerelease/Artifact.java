package ar.com.bpba.muleservicemanager.getdetallerelease;
public class Artifact{
    public int id;
    public String type;
    public String alias;
    public DefinitionReference definitionReference;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public DefinitionReference getDefinitionReference() {
        return definitionReference;
    }

    public void setDefinitionReference(DefinitionReference definitionReference) {
        this.definitionReference = definitionReference;
    }
    
}
