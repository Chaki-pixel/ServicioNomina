package model;

import Nomina.Empleado;

//Clase hija de Empleado
public class PorComision extends Empleado {
 private double ventasBrutas;
 private double tarifaComision;

 public PorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision) {
     super(primerNombre, apellidoPaterno, numeroSeguroSocial);
     this.ventasBrutas = ventasBrutas;
     this.tarifaComision = tarifaComision;
 }

 @Override
 public double calcularPagoSemanal() {
     return ventasBrutas * tarifaComision;
 }

 @Override
 public String detalleCalculo() {
     return "Ventas = $" + ventasBrutas + ", Comisión = " + (tarifaComision * 100) + "%";
 }

 @Override
public String obtenerDetallePago() {
	// TODO Auto-generated method stub
	return null;
 }
}
