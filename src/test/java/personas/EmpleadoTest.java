package personas;

import domain.operaciones.Alquiler;
import domain.operaciones.Venta;
import domain.personas.Cliente;
import domain.personas.Empleado;
import domain.propiedades.Casa;
import domain.propiedades.EstadoInmueble;

import org.junit.Assert;
import org.junit.Test;

public class EmpleadoTest {

    @Test
    public void EmpleadoReservaInmueble(){
        Empleado jose = new Empleado("Jose", "Lopez", 13888600);
        Cliente pedro = new Cliente("Pedro", "Aznar", 1288900);
        Casa casita = new Casa(50.0, 3);
        Alquiler alquilar = new Alquiler();

        jose.reservarInmueble(casita, pedro, alquilar);

        System.out.println(jose.getPropsReservadas().size());
    }

    @Test
    public void EmpleadoVendeCasa(){
        Empleado jose = new Empleado("Jose", "Lopez", 13888600);
        Cliente pedro = new Cliente("Pedro", "Aznar", 1288900);
        Casa casita = new Casa(50.0, 3);
        Venta venta = new Venta();

        venta.setCliente(pedro);
        casita.setEstadoInmueble(EstadoInmueble.DISPONIBLE);
        jose.concretarVenta(venta, pedro, casita);

        Assert.assertEquals(1, pedro.getPropiedades().size());
        Assert.assertEquals(1, jose.getPropsVendidas().size());
    }

    @Test
    public void EmpleadoQuiereVenderCasaReservadaParaOtroCliente(){
        Empleado jose = new Empleado("Jose", "Lopez", 13888600);
        Cliente pedro = new Cliente("Pedro", "Aznar", 1288900);
        Casa casita = new Casa(50.0, 3);
        Venta venta = new Venta();

        venta.setCliente(pedro);
        casita.setEstadoInmueble(EstadoInmueble.RESERVADO);
        jose.concretarVenta(venta, pedro, casita);

        Assert.assertEquals(0, jose.getPropsVendidas().size());
    }

    @Test
    public void EmpleadoAlquilaCasa(){
        Empleado jose = new Empleado("Jose", "Lopez", 13888600);
        Cliente pedro = new Cliente("Pedro", "Aznar", 1288900);
        Casa casita = new Casa(50.0, 3);
        Alquiler alquiler = new Alquiler();

        casita.setEstadoInmueble(EstadoInmueble.DISPONIBLE);
        alquiler.setCliente(pedro);
        jose.concretarAlquiler(alquiler, pedro, casita);

        Assert.assertEquals(1, jose.getPropsAlquiladas().size());
    }
}
