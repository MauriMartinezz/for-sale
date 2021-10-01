package domain.propiedades;

public class PH extends Inmueble{
    private Double valorMetroCuadrado;
    private Double valorMinimoVenta;

    public PH(double metrosCuadrados, Integer cantAmbientes) {
        super(metrosCuadrados, cantAmbientes);
    }


    public void setValorMetroCuadrado(Double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public void setValorMinimoVenta(Double valorMinimoVenta) {
        this.valorMinimoVenta = valorMinimoVenta;
    }

    @Override
    public Double calcularValor() {
        Double valorPH = (valorMetroCuadrado*super.metrosCuadrados);
        if(valorPH >= valorMinimoVenta){
            return valorMetroCuadrado*super.metrosCuadrados;
        }else{
            return this.valorMinimoVenta;
        }
    }
}
