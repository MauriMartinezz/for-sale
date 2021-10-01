package personas;

import domain.operaciones.Alquiler;
import domain.operaciones.Venta;
import domain.personas.Cliente;
import domain.personas.Empleado;
import domain.personas.Inmobiliaria;
import domain.propiedades.Casa;
import domain.propiedades.Departamento;
import domain.propiedades.EstadoInmueble;
import domain.propiedades.PH;
import org.junit.Assert;
import org.junit.Test;

public class InmobiliariaTest {
    @Test
    public void mejorEmpleado(){
        Empleado carlos = new Empleado("Carlos", "Jimenez", 1233214);
        Empleado raul = new Empleado("Raul", "Gomez", 1239128);
        Empleado jorge = new Empleado("Jorge", "Luchetti", 2247219);

        Cliente mauricio = new Cliente("Mauricio", "Martinez", 42964859);
        Alquiler alquiler = new Alquiler();
        alquiler.setCantMeses(12);
        alquiler.setCliente(mauricio);

        Casa casita = new Casa(100.0, 4);
        casita.setEstadoInmueble(EstadoInmueble.DISPONIBLE);
        carlos.concretarAlquiler(alquiler, mauricio, casita);

            /////////////////////////////////////////// Ranking RAUL /////////////////////////


        Cliente monica = new Cliente("Monica", "Perez", 3277298);

        Departamento depto = new Departamento(100.0, 4);
        depto.setEstadoInmueble(EstadoInmueble.DISPONIBLE);

        Alquiler alquilerMonica = new Alquiler();
        alquilerMonica.setCliente(monica);

        raul.concretarAlquiler(alquilerMonica, monica, depto);


        Cliente marcelo = new Cliente("Marcelo", "Lopez", 172831);

        Casa casota = new Casa(90.0, 3);
        casota.setEstadoInmueble(EstadoInmueble.DISPONIBLE);

        Venta ventaMarcelo = new Venta();
        ventaMarcelo.setCliente(marcelo);
        raul.concretarVenta(ventaMarcelo, marcelo, casota);


        Cliente agustin = new Cliente("Agustin", "Martinez", 3213322);

        PH phAgustin = new PH(120.0, 4);
        phAgustin.setEstadoInmueble(EstadoInmueble.DISPONIBLE);

        Alquiler alquilerAgustin = new Alquiler();
        alquilerAgustin.setCliente(agustin);

        raul.concretarAlquiler(alquilerAgustin, agustin, phAgustin);

        Inmobiliaria remax = new Inmobiliaria();
        remax.addEmpleados(raul, jorge, carlos);
        System.out.println(remax.mejorEmpleado(remax.getEmpleados()).getNombre());


        Assert.assertEquals("Raul", remax.mejorEmpleado(remax.getEmpleados()).getNombre());
    }

//        remax.addEmpleados(carlos, raul, jorge);
//
//        for (int i = 0; i < remax.getEmpleados().size(); i++) {
//            System.out.println(remax.getEmpleados().get(0).getNombre());
//            System.out.println(remax.getEmpleados().get(i).getRanking());
//        }

//        System.out.println(remax.mejorEmpleado(remax.getEmpleados()));
//        System.out.println(remax.getEmpleados());
//        System.out.println(remax.getEmpleados().size());

    @Test
    public void inmobiliariaContrata3Empleados(){
        Empleado carlos = new Empleado("Carlos", "Jimenez", 1233214);
        Empleado raul = new Empleado("Raul", "Gomez", 1239128);
        Empleado jorge = new Empleado("Jorge", "Luchetti", 2247219);

        Inmobiliaria remax = new Inmobiliaria();

        remax.addEmpleados(jorge, raul , carlos);

        System.out.println(remax.getEmpleados().size());

    }
}
