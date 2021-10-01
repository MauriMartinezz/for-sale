package domain.propiedades;

public class Zona{
    private Double coheficientePrecio;
    private String nombre;

    public Zona(String nombre){
        this.nombre = nombre;
    }
    public void setCoheficientePrecio(Double coheficientePrecio) {
        this.coheficientePrecio = coheficientePrecio;
    }

    public Double getCoheficientePrecio() {
        return coheficientePrecio;
    }

    public String getNombre() {
        return nombre;
    }
}
