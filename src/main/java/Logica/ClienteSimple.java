package Logica;
import ClasesMaestras.Persona1;

public class ClienteSimple extends Persona1 {
    private int dni;
    private boolean antecedente;

    private LicenciaConducir licencia;

    public ClienteSimple() {
        licencia = new LicenciaConducir();
    }

    public ClienteSimple(String nombre, int idCliente, String telefono,
                         String fechaRegistro, int dni,
                         boolean antecedente,
                         LicenciaConducir licencia) {

        super(nombre, idCliente, telefono, fechaRegistro);

        this.dni = dni;
        this.antecedente = antecedente;
        this.licencia = licencia;
    }

    public void mostrarPersona() {
        System.out.println("CLIENTE SIMPLE");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + idCliente);
        System.out.println("Telefono: " + numTelefono);
        System.out.println("Fecha Registro: " + fechaRegistro);
        System.out.println("DNI: " + dni);
        System.out.println("Antecedentes: " + antecedente);

        if (licencia != null) {
            licencia.mostrarLicencia();
        }
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isAntecedente() {
        return antecedente;
    }

    public void setAntecedente(boolean antecedente) {
        this.antecedente = antecedente;
    }

    public LicenciaConducir getLicencia() {
        return licencia;
    }

    public void setLicencia(LicenciaConducir licencia) {
        this.licencia = licencia;
    }
}
