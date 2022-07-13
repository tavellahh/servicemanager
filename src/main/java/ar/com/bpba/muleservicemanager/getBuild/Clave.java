package ar.com.bpba.muleservicemanager.getBuild;
public class Clave{
    public Object value;
    public boolean isSecret;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public boolean isIsSecret() {
        return isSecret;
    }

    public void setIsSecret(boolean isSecret) {
        this.isSecret = isSecret;
    }
}