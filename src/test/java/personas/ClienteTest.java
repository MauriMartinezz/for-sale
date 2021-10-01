package personas;

import domain.personas.Cliente;
import domain.propiedades.Casa;
import domain.propiedades.Inmueble;
import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

    @Test
    public void ClienteHaceUnaOperacion(){
        Cliente cliente = new Cliente("Carlos", "Garcia", 12222800);
        Inmueble casita = new Casa(120.0, 4);

        cliente.addPropiedad(casita);

        Assert.assertEquals(1, cliente.getPropiedades().size());
    }
}
