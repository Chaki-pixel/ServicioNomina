package model;

import Nomina.Empleado;

public class AsalariadoPorComision extends Empleado {
    private double ventasBrutas;
    private double tarifaComision;
    private double salarioBase;

    public AsalariadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularPagoSemanal() {
        return (ventasBrutas * tarifaComision) + salarioBase + (salarioBase * 0.10);
    }

    @Override
    public String obtenerDetallePago() {
        return "Ventas: $" + ventasBrutas + ", Comisión: " + (tarifaComision * 100) + "%, Salario base: $" + salarioBase;
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
