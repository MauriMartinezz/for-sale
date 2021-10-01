package domain.personas;

public abstract class Persona {
    protected String nombre, apellido;
    protected Integer numDoc;
    protected TipoDoc tipoDoc;

    public Persona(String nombre, String apellido, Integer numDoc ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numDoc = numDoc;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Integer numDoc) {
        this.numDoc = numDoc;
    }

    public TipoDoc getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(TipoDoc tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
}
