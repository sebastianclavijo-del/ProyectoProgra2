    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesMaestras;

import java.io.Serializable; 
/**
 *
 * @author LENOVO
 */
public abstract class Persona1 implements Serializable{
    protected String nombre;
    protected int idCliente;
    protected String numTelefono;
    protected String fechaRegistro;

    public Persona1() {
    }

    public Persona1(String nombre, int idCliente, String numTelefono, String fechaRegistro) {
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.numTelefono = numTelefono;
        this.fechaRegistro = fechaRegistro;
    }

    public abstract void mostrarPersona();

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
