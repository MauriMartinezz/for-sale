package domain.personas;

import domain.operaciones.Operacion;
import domain.propiedades.EstadoInmueble;
import domain.propiedades.Inmueble;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona{
    private List<Inmueble> propsAlquiladas;
    private List<Inmueble> propsVendidas;
    private List<Inmueble> propsReservadas;
    private Integer ranking;


    public Empleado(String nombre, String apellido, int numDoc) {
        super(nombre, apellido, numDoc);
        this.propsAlquiladas = new ArrayList<>();
        this.propsVendidas = new ArrayList<>();
        this.propsReservadas = new ArrayList<>();
        this.ranking = 0;
    }



    public List<Inmueble> getPropsReservadas() {
        return propsReservadas;
    }

    public List<Inmueble> getPropsVendidas() {
        return propsVendidas;
    }

    public List<Inmueble> getPropsAlquiladas() {
        return propsAlquiladas;
    }

    public void concretarAlquiler(Operacion unaOperacion, Cliente unCliente, Inmueble inmueble){

        if (inmueble.getEstadoInmueble().equals(EstadoInmueble.DISPONIBLE)) {

            if (unaOperacion.getCliente().equals(unCliente)) {
                this.propsAlquiladas.add(inmueble);
                unCliente.addPropiedad(inmueble);
                inmueble.setEstadoInmueble(EstadoInmueble.ALQUILADO);
                this.ranking += 1;
            }

        }
    }

    public void concretarVenta(Operacion unaOperacion, Cliente unCliente, Inmueble inmueble) {

        if (inmueble.getEstadoInmueble().equals(EstadoInmueble.DISPONIBLE)) {
            if (unaOperacion.getCliente().equals(unCliente)) {
                this.propsVendidas.add(inmueble);
                unCliente.addPropiedad(inmueble);
                inmueble.setEstadoInmueble(EstadoInmueble.VENDIDO);
                this.ranking = this.ranking +1;
            }
        }
    }
    public String reservarInmueble(Inmueble inmueble, Cliente unCliente, Operacion operacion) {

        if(inmueble.getEstadoInmueble().equals(EstadoInmueble.RESERVADO)) {
            operacion.setEmpleado(this);
            operacion.setCliente(unCliente);
            inmueble.setEstadoInmueble(EstadoInmueble.RESERVADO);
            this.propsReservadas.add(inmueble);
            this.ranking += 1;
            return "Propiedad reservada para " + unCliente.getNombre();
        }else{
            return "La propiedad ya esta reservada";
        }
    }

    public Integer getRanking() {
        return ranking;
    }
}
