package operaciones;

import domain.operaciones.Alquiler;
import domain.propiedades.Departamento;
import org.junit.Assert;
import org.junit.Test;

public class AlquilerTest {

    @Test
    public void AlquilerDura1Anio(){
        Alquiler alquiler = new Alquiler();
        alquiler.setCantMeses(12);

        Assert.assertEquals(12, alquiler.getCantMeses().intValue());
    }

    @Test
    public void AlquilerComisionTest(){

        Alquiler alquiler = new Alquiler();
        Departamento depto = new Departamento(40.0, 10);

        depto.setPrecioAmbiente(350000.0);

        alquiler.setInmueble(depto);
        alquiler.setCantMeses(12);
        alquiler.setFactorComision(500000.0);

        Assert.assertEquals(84, alquiler.calcularComision(depto).intValue());

    }

}
