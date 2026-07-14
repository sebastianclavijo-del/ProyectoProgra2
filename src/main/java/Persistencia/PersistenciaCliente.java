/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

/**
 *
 * @author USER
 */
import Logica.ClienteSimple;
import MovTransaccionales.ArregloCliente1;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class PersistenciaCliente {
    
    private static final String ARCHIVO_CLIENTES = "clientes.dat";

   
    public static void guardarClientes(ArregloCliente1 contenedor) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_CLIENTES))) {
        
        int total = contenedor.cantidadClientes();
        ClienteSimple[] listaAGuardar = new ClienteSimple[total];
        for (int i = 0; i < total; i++) {
            listaAGuardar[i] = (ClienteSimple) contenedor.obtenerCliente(i);
        }    
        oos.writeObject(listaAGuardar);    
        System.out.println("¡Datos de clientes serializados con éxito en " + ARCHIVO_CLIENTES + "!");
        
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo .dat: " + e.getMessage());
        }
    }

    public static void cargarClientes(ArregloCliente1 contenedor) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO_CLIENTES))) {
            
            ClienteSimple[] clientesLeidos = (ClienteSimple[]) ois.readObject();
            
            for (ClienteSimple cliente : clientesLeidos) {
                if (cliente != null) {
                    contenedor.agregarCliente(cliente);
                }
            }
            
            System.out.println("¡Clientes recuperados con éxito desde el archivo");
            
        } catch (IOException e) {
            System.out.println("No se encontró el archivo '" + ARCHIVO_CLIENTES + "'. Se creará uno nuevo al guardar.");
        } catch (ClassNotFoundException e) {
            System.err.println("Error en el formato de clase al leer el archivo: " + e.getMessage());
        }
    }
}
