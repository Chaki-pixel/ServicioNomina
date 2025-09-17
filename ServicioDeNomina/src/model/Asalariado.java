package model;

import Nomina.Empleado;

// Clase hija de Empleado
public class Asalariado extends Empleado {
    private double salarioSemanal;

    public Asalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double salarioSemanal) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double calcularPagoSemanal() {
        return salarioSemanal;
    }

    @Override
    public String detalleCalculo() {
        return "Salario fijo semanal = $" + salarioSemanal;
    }

	@Override
	public String obtenerDetallePago() {
		// TODO Auto-generated method stub
		return null;
	}
}
