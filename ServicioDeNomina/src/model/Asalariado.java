package model;

import Nomina.Empleado;

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
    public String obtenerDetallePago() {
        return "Salario semanal fijo: $" + salarioSemanal;
    }

	@Override
	protected String getPrimerNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getApellidoPaterno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getNumeroSeguroSocial() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String detalleCalculo() {
		// TODO Auto-generated method stub
		return null;
	}
}
