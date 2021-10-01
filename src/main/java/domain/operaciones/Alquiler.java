package domain.operaciones;

import domain.propiedades.Inmueble;

public class Alquiler extends Operacion {
    private Integer cantMeses;

    public void setCantMeses(Integer cantMeses) {
        this.cantMeses = cantMeses;
    }

    public void setFactorComision(Double factorComision) {
        super.factorComision = factorComision;
    }

    public Integer getCantMeses() {
        return cantMeses;
    }

    @Override
    public Double calcularComision(Inmueble inmueble) {
        return this.cantMeses * (inmueble.calcularValor()/super.factorComision);
    }
}
