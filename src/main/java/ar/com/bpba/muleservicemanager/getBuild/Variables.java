package ar.com.bpba.muleservicemanager.getBuild;
public class Variables{
    public SystemDebug systemDebug;
    public NombreProyecto nombreProyecto;
    public Usuario usuario;
    public Clave clave;

    public SystemDebug getSystemDebug() {
        return systemDebug;
    }

    public void setSystemDebug(SystemDebug systemDebug) {
        this.systemDebug = systemDebug;
    }

    public NombreProyecto getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(NombreProyecto nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Clave getClave() {
        return clave;
    }

    public void setClave(Clave clave) {
        this.clave = clave;
    }
}