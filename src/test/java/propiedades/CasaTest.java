package propiedades;

import domain.propiedades.Casa;
import org.junit.Assert;
import org.junit.Test;

public class CasaTest {

    @Test
    public void CasaValeCienMil(){

        Casa casita = new Casa(50.0, 3);
        casita.setPrecio(100000.0);

        Assert.assertEquals(100000, casita.calcularValor().intValue());

    }
}
