package repositorio;

import Nomina.Empleado;
import java.util.*;

public class RepositorioEmpleado {
    private List<Empleado> empleados = new ArrayList<>();

    public void agregar(Empleado e) {
        empleados.add(e);
    }

    public List<Empleado> obtenerTodos() {
        return empleados;
    }

    public void actualizar(String ssn, Empleado nuevo) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).numeroSeguroSocial.equals(ssn)) {
                empleados.set(i, nuevo);
                break;
            }
        }
    }
}
