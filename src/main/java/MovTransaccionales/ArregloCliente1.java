/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MovTransaccionales;

import java.util.ArrayList;

import ClasesMaestras.Persona1;


public class ArregloCliente1{

    private ArrayList<Persona1> clientes;

    public ArregloCliente1() {
        clientes = new ArrayList<>();
    }

    public void agregarCliente(Persona1 p) {
        clientes.add(p);
    }

    public Persona1 buscarCliente(int idCliente) {

        for (Persona1 p : clientes) {
            if (p.getIdCliente() == idCliente) {
                return p;
            }
        }

        return null;
    }

    public boolean eliminarCliente(int idCliente) {

        Persona1 p = buscarCliente(idCliente);

        if (p != null) {
            clientes.remove(p);
            return true;
        }

        return false;
    }

    public boolean modificarCliente(int idCliente, Persona1 nuevo) {

        for (int i = 0; i < clientes.size(); i++) {

            if (clientes.get(i).getIdCliente() == idCliente) {

                clientes.set(i, nuevo);
                return true;
            }
        }

        return false;
    }

    public void mostrarClientes() {

        if (clientes.isEmpty()) {
            System.out.println("No existen clientes registrados.");
            return;
        }

        for (Persona1 p : clientes) {
            p.mostrarPersona();
            System.out.println("------------------------");
        }
    }

    public int cantidadClientes() {
        return clientes.size();
    }

    public Persona1 obtenerCliente(int pos) {

        if (pos >= 0 && pos < clientes.size()) {
            return clientes.get(pos);
        }

        return null;
    }

    public ArrayList<Persona1> getClientes() {
        return clientes;
    }
}
