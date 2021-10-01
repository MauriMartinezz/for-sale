package domain.personas;


import domain.propiedades.Inmueble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inmobiliaria {
    private List<Empleado> empleados;



    public Inmobiliaria() {
        this.empleados = new ArrayList<>();
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

   public void addEmpleados(Empleado ... empleados){
        Collections.addAll(this.empleados, empleados);
    }


    public Empleado mejorEmpleado(List<Empleado> empleados){
        Empleado bestEmployee = this.empleados.get(0);
        for (int i = 0; i < empleados.size(); i++) {
            if(empleados.get(i).getRanking() > bestEmployee.getRanking()){
                bestEmployee = empleados.get(i);
            }
        }

        return bestEmployee;
    }
}

