package model;

import Nomina.Empleado;

public class PorHoras extends Empleado {
    private double sueldoPorHora;
    private double horasTrabajadas;

    public PorHoras(String apellidoPaterno, String numeroSeguroSocial, double sueldoPorHora, double horasTrabajadas) {
        super("", apellidoPaterno, numeroSeguroSocial);
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
    public String obtenerDetallePago() {
        return "Horas trabajadas: " + horasTrabajadas + ", Sueldo por hora: $" + sueldoPorHora;
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
