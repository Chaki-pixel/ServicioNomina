package model;

import Nomina.Empleado;

//Clase hija de Empleado
public class PorHoras extends Empleado {
 private double sueldoPorHora;
 private double horasTrabajadas;

 public PorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double sueldoPorHora, double horasTrabajadas) {
     super(primerNombre, apellidoPaterno, numeroSeguroSocial);
     this.sueldoPorHora = sueldoPorHora;
     this.horasTrabajadas = horasTrabajadas;
 }

 @Override
 public double calcularPagoSemanal() {
     if (horasTrabajadas <= 40) {
         return sueldoPorHora * horasTrabajadas;
     } else {
         return (sueldoPorHora * 40) + (sueldoPorHora * 1.5 * (horasTrabajadas - 40));
     }
 }

 @Override
 public String detalleCalculo() {
     return "Horas = " + horasTrabajadas + ", Sueldo/hora = $" + sueldoPorHora;
 }

 @Override
public String obtenerDetallePago() {
	// TODO Auto-generated method stub
	return null;
 }
}
