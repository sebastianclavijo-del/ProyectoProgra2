package Logica;

import ClasesMaestras.Persona1;

public class Empresa extends Persona1 {
    private boolean asociado;
    private int credito;
    private String cargo;
    private String ruc;

    public Empresa() {
    }

    public Empresa(String nombre, int idCliente,
                   String telefono, String fechaRegistro,
                   boolean asociado, int credito,
                   String cargo, String ruc) {

        super(nombre, idCliente, telefono, fechaRegistro);

        this.asociado = asociado;
        this.credito = credito;
        this.cargo = cargo;
        this.ruc = ruc;
    }

    @Override
    public void mostrarPersona() {
        System.out.println("EMPRESA");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + idCliente);
        System.out.println("Telefono: " + numTelefono);
        System.out.println("Fecha Registro: " + fechaRegistro);
        System.out.println("Asociado: " + asociado);
        System.out.println("Credito: " + credito);
        System.out.println("Cargo: " + cargo);
        System.out.println("RUC: " + ruc);
    }

    public boolean isAsociado() {
        return asociado;
    }

    public void setAsociado(boolean asociado) {
        this.asociado = asociado;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
}
