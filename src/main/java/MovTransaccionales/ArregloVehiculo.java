/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MovTransaccionales;

import java.util.ArrayList;
import ClasesMaestras.Vehiculo1;
/**
 *
 * @author USER
 * @param <T>
 */
public class ArregloVehiculo<T extends Vehiculo1> {
    
    public ArrayList<T> listaVehiculos = new ArrayList<>();
    
    public void AgregarVehiculo(T vehiculo) {
        listaVehiculos.add(vehiculo);
    }

    public void MostrarArreglo() {
        if (listaVehiculos.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        for (T v : listaVehiculos) {
            v.MostrarDatos();
        }
    }
    
    public T BuscarVehiculo(T vebuscado) {
        for (T v : listaVehiculos) {
            if (v.equals(vebuscado)) {
                v.MostrarDatos();
                System.out.println("Elemento encontrado...");
                return v;
            }
        }
        System.out.println("Este elemento no existe.");
        return null;
    }
    
    public void EliminarVehiculo(T vehelement) {
        T v = BuscarVehiculo(vehelement);
        if (v != null) {
            listaVehiculos.remove(v);
            System.out.println("Elemento eliminado exitosamente...");
        } else {
            System.out.println("El elemento no existe.");
        }
    }
    
    public void ModificarVehiculo(T vebuscado) {
        for (int i = 0; i < listaVehiculos.size(); i++) {
            T v = listaVehiculos.get(i);
            if (v.equals(vebuscado)) {
                v.MostrarDatos();
                v.IngresarDatos();
                System.out.println("Elemento modificado exitosamente.");
                return;
            }
        }
        System.out.println("Este elemento no existe.");
    }

    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

