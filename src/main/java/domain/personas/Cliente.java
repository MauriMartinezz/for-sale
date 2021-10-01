package domain.personas;

import domain.operaciones.Operacion;
import domain.propiedades.Inmueble;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona{
    private List<Inmueble> propiedades;
    private List<Inmueble> reservas;

    public Cliente(String nombre, String apellido, Integer numDoc) {
        super(nombre, apellido, numDoc);

        this.propiedades = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public List<Inmueble> getPropiedades() {
        return propiedades;
    }

    public void addPropiedad(Inmueble inmueble){
        this.propiedades.add(inmueble);
    }

}
