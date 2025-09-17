//Braiam Jose Santana Cuevas 2024-2533 
package Nomina;

import java.util.*;

import model.Asalariado;
import model.AsalariadoPorComision;
import model.PorComision;
import model.PorHoras;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        // Agregamos empleados con nombres dominicanos y errores ortográficos
        empleados.add(new Asalariado("Yomaira", "Peréz", "001-23-4567", 750.0));
        empleados.add(new PorHoras("Luis", "Rodriges", "002-34-5678", 180.0, 38));
        empleados.add(new PorComision("Kelvin", "Martínez", "003-45-6789", 4200.0, 0.05));
        empleados.add(new AsalariadoPorComision("Leidy", "Gonzales", "004-56-7890", 3100.0, 0.04, 500.0));
        empleados.add(new Asalariado("Francisca", "Mendez", "005-67-8901", 820.0));
        empleados.add(new PorHoras("Morla", "Gómes", "006-78-9012", 200.0, 45));
        empleados.add(new PorComision("Jhonny", "Reyes", "007-89-0123", 6000.0, 0.06));
        empleados.add(new AsalariadoPorComision("Anyelina", "De la Cruz", "008-90-1234", 2800.0, 0.05, 550.0));

        // Reporte con polimorfismo
        System.out.println("=== Reporte Semanal de Nómina ===\n");

        for (Empleado e : empleados) {
            System.out.println("Nombre: " + e.getPrimerNombre() + " " + e.getApellidoPaterno());
            System.out.println("SSN: " + e.getNumeroSeguroSocial());
            System.out.println("Tipo de empleado: " + e.getClass().getSimpleName());
            System.out.println("Detalle del cálculo: " + e.detalleCalculo());
            System.out.println("Pago semanal: $" + e.calcularPagoSemanal());
            System.out.println("----------------------------------\n");
        }
    }
}
