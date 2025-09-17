package reporte;

import Nomina.Empleado;
import java.util.List;

public class GeneradorReporte {
    public void generar(List<Empleado> empleados) {
        System.out.println("=== Reporte Semanal ===");
        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.primerNombre + " " + e.apellidoPaterno);
            System.out.println("SSN: " + e.numeroSeguroSocial);
            System.out.println("Detalle: " + e.obtenerDetallePago());
            System.out.println("Pago semanal: $" + e.calcularPagoSemanal());
            System.out.println("------------------------");
        }
    }
}

