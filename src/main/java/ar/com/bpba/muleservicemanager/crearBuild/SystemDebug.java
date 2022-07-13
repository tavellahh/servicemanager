package ar.com.bpba.muleservicemanager.crearBuild;
public class SystemDebug{
    public String value;
    public boolean allowOverride;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isAllowOverride() {
        return allowOverride;
    }

    public void setAllowOverride(boolean allowOverride) {
        this.allowOverride = allowOverride;
    }
}