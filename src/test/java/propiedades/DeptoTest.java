package propiedades;

import domain.propiedades.Departamento;
import org.junit.Assert;
import org.junit.Test;

public class DeptoTest {
    @Test
    public void DepartamentoValeSetecientosMil(){
        Departamento depto = new Departamento(40.0, 2);
        depto.setPrecioAmbiente(350000.0);
        Assert.assertEquals(700000, depto.calcularValor().intValue());
    }
}
