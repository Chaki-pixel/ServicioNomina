
package Nomina;

public abstract class Empleado {
    public String primerNombre;
    public String apellidoPaterno;
    public String numeroSeguroSocial;

    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public abstract double calcularPagoSemanal();
    public abstract String obtenerDetallePago();

	protected abstract String getPrimerNombre();

	protected abstract String getApellidoPaterno();

	protected abstract String getNumeroSeguroSocial();

	protected abstract String detalleCalculo();
}
