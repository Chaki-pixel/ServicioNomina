package Nomina;

// Clase padre abstracta
public abstract class Empleado {
    public String primerNombre;
    public String apellidoPaterno;
    public String numeroSeguroSocial;

    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    // Métodos getter
    public String getPrimerNombre() { return primerNombre; }
    public String getApellidoPaterno() { return apellidoPaterno; }
    public String getNumeroSeguroSocial() { return numeroSeguroSocial; }

    // Métodos abstractos que serán implementados por las clases hijas
    public abstract double calcularPagoSemanal(); // POLIMORFISMO
    public abstract String detalleCalculo();      // POLIMORFISMO

	public abstract String obtenerDetallePago();
}
