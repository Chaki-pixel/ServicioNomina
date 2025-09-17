//Braiam Jose Santana Cuevas 2024-2533 
package Nomina;

import java.util.*;

import model.Asalariado;
import model.AsalariadoPorComision;
import model.PorComision;
import model.PorHoras;

// Clase principal del sistema
public class Main {

    public static void main(String[] args) {

        // Creamos una lista de empleados (POLIMORFISMO: todos tratados como Empleado)
        List<Empleado> empleados = new ArrayList<>();

        // Agregamos varios empleados de diferentes tipos
        // Cada uno es una clase hija de Empleado

        // Empleado asalariado (clase hija)
        empleados.add(new Asalariado("Yomaira", "Peréz", "001-23-4567", 750.0));

        // Empleado por horas (clase hija)
        empleados.add(new PorHoras("Rodriges", "002-34-5678", 180.0, 38)); // nombre mal escrito

        // Empleado por comisión (clase hija)
        empleados.add(new PorComision("Kelvin", "Martínez", "003-45-6789", 4200.0, 0.05));

        // Empleado asalariado por comisión (clase hija)
        empleados.add(new AsalariadoPorComision("Leidy", "Gonzales", "004-56-7890", 3100.0, 0.04, 500.0)); // Gonzales sin tilde

        // Otro asalariado
        empleados.add(new Asalariado("Francisca", "Mendez", "005-67-8901", 820.0));

        // Otro por horas con horas extras
        empleados.add(new PorHoras("Morla", "006-78-9012", 200.0, 45)); // pago con horas extra

        // Otro por comisión
        empleados.add(new PorComision("Jhonny", "Reyes", "007-89-0123", 6000.0, 0.06)); // nombre con error ortográfico

        // Otro asalariado por comisión
        empleados.add(new AsalariadoPorComision("Anyelina", "De la Cruz", "008-90-1234", 2800.0, 0.05, 550.0));

        // Generamos el reporte
        System.out.println("=== Reporte Semanal de Nómina ===\n");

        for (Empleado e : empleados) {
            // POLIMORFISMO: aunque usamos tipo Empleado, se ejecuta el método de la clase hija
            System.out.println("Nombre: " + e.getPrimerNombre() + " " + e.getApellidoPaterno());
            System.out.println("SSN: " + e.getNumeroSeguroSocial());
            System.out.println("Tipo: " + e.getClass().getSimpleName()); // muestra la clase hija
            System.out.println("Detalle del cálculo: " + e.detalleCalculo());
            System.out.println("Pago semanal: $" + e.calcularPagoSemanal());
            System.out.println("----------------------------------\n");
        }
    }
}
