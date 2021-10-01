package domain.operaciones;

import domain.personas.Cliente;
import domain.personas.Empleado;
import domain.propiedades.Inmueble;

public abstract class Operacion {

    protected Cliente cliente;
    protected Empleado empleado;
    protected Double factorComision;
    protected Inmueble inmueble;




    protected Double calcularComision(Inmueble inmueble){
        return 0.0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }


    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }
}
