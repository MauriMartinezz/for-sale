package domain.propiedades;

public class Departamento extends Inmueble {
    private Double precioAmbiente;

    public Departamento(Double metrosCuadrados, Integer cantAmbientes) {
        super(metrosCuadrados, cantAmbientes);

    }

    public void setPrecioAmbiente(Double precioAmbiente) {
        this.precioAmbiente = precioAmbiente;
    }

    @Override
    public Double calcularValor() {
        return precioAmbiente*super.cantAmbientes;
    }
}
