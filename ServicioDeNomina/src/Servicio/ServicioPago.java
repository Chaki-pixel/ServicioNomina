package Servicio;

import Nomina.Empleado;

public class ServicioPago {
    public double calcular(Empleado empleado) {
        return empleado.calcularPagoSemanal();
    }
}
