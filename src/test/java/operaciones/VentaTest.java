package operaciones;

import domain.operaciones.Venta;
import domain.propiedades.Casa;
import domain.propiedades.Inmueble;
import domain.propiedades.PH;
import domain.propiedades.Zona;
import org.junit.Assert;
import org.junit.Test;

public class VentaTest {

    @Test
    public void ComisionVentaTest(){
        Venta venta = new Venta();
        Casa casita = new Casa(100.0, 4);

        casita.setPrecio(400000.0);
        venta.setInmueble(casita);
        venta.setFactorComision(0.015);

        int valorComision = venta.calcularComision(venta.getInmueble()).intValue();
        Assert.assertEquals(6000, valorComision);
    }

    @Test
    public void VenderPH(){
        Venta venta = new Venta();
        PH ph = new PH(120.0, 3);
        Zona palermo = new Zona("Palermo");
        palermo.setCoheficientePrecio(1.3);

        ph.setZona(palermo);


        System.out.println(ph.getZona().getCoheficientePrecio() * ph.calcularValor());
        venta.setInmueble(ph);
        venta.setFactorComision(0.015);

//        System.out.println(valorComision);




    }
}
