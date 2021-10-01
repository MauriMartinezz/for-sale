package domain.propiedades;

public class Casa extends Inmueble{
    private Double precio;
    public Casa(double metrosCuadrados, Integer cantAmbientes) {
        super(metrosCuadrados, cantAmbientes);
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public Double calcularValor() {
        return this.precio;
    }
}
