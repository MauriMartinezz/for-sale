package propiedades;

import domain.propiedades.PH;
import org.junit.Assert;
import org.junit.Test;

public class PHTest {

    @Test
    public void PHQuinientosMil(){
        PH ph = new PH(10.0, 1);

        ph.setValorMetroCuadrado(14000.0);
        ph.setValorMinimoVenta(500000.0);

        System.out.println(ph.calcularValor());
    }

    @Test
    public void PHValeMasQueQuinientosMil(){
        PH ph = new PH(100.0, 4);

        ph.setValorMinimoVenta(500000.0);
        ph.setValorMetroCuadrado(14000.0);

        Assert.assertEquals(1400000, ph.calcularValor().intValue());
    }
}
