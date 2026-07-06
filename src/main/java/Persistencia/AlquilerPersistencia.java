/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Alquiler;
import Logica.Nodo;
import java.io.*;
/**
 *
 * @author USER
 */
public class AlquilerPersistencia {
    Nodo actual = new Nodo();
    
    public void GuardarAlquiler(Nodo cab){
        try{
            FileOutputStream o = new FileOutputStream("Alquiler.dat");
            ObjectOutputStream p = new ObjectOutputStream(o);
            while(cab != null){
                p.writeObject(cab.dato);
                cab = cab.sig;
            }
            p.flush();
            o.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public Nodo RecuperarAlquiler() {
        Nodo nuevaCab = null;
        Nodo ultimo = null;
        
        try (ObjectInputStream p = new ObjectInputStream(new FileInputStream("Alquiler.dat"))) {
            while (true) {
                Alquiler alq = (Alquiler) p.readObject();
                Nodo n = new Nodo();
                n.dato = alq;
                n.sig = null;
                if (nuevaCab == null) {
                    nuevaCab = n;
                    ultimo = n;
                } else {
                    ultimo.sig = n;
                    ultimo = n;
                }
            }
        } catch (EOFException e) {
            System.out.println("Se recuperaron los datos exitosamente.");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo. Se creará uno nuevo al guardar.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al recuperar los datos: " + e.getMessage());
            e.printStackTrace();
        }
        return nuevaCab;
    }
    
}
