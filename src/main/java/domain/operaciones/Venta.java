package domain.operaciones;

import domain.operaciones.Operacion;
import domain.propiedades.Inmueble;

public class Venta extends Operacion {


    public void setFactorComision(Double factorComision) {
        this.factorComision = factorComision;
    }

    @Override
    public Double calcularComision(Inmueble inmueble) {
        return inmueble.calcularValor() * super.factorComision;
    }
}
