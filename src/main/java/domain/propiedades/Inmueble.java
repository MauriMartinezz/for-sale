package domain.propiedades;

public abstract class Inmueble {
    protected Integer cantAmbientes;
    protected EstadoInmueble estadoInmueble;
    protected Double metrosCuadrados;
    protected Zona zona;

    public Inmueble(double metrosCuadrados, Integer cantAmbientes){
        this.cantAmbientes = cantAmbientes;
        this.metrosCuadrados = metrosCuadrados;

    }
    public Double calcularValor(){
        return null;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public EstadoInmueble getEstadoInmueble() {
        return estadoInmueble;
    }

    public void setEstadoInmueble(EstadoInmueble estadoInmueble) {
        this.estadoInmueble = estadoInmueble;
    }

}
