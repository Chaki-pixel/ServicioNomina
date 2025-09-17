package model;

import Nomina.Empleado;

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
    public String obtenerDetallePago() {
        return "Ventas brutas: $" + ventasBrutas + ", Tarifa comisión: " + (tarifaComision * 100) + "%";
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
