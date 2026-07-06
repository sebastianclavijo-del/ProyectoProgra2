/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.io.*;
import java.util.ArrayList;
import ClasesMaestras.Vehiculo1;
/**
 *
 * @author USER
 */
public class VehiculoPersistencia<T>{
    ArrayList<T> v = new ArrayList<>();
    
    public void GuardarVehiculos(ArrayList<T> veh){
        try{
            FileOutputStream o = new FileOutputStream("Vehiculo.dat");
            ObjectOutputStream p = new ObjectOutputStream(o);
            for(int i=0;i<veh.size();i++){
                p.writeObject(veh.get(i));
            }
            p.flush();
            o.close();
            System.out.println("Vehiculos guardados correctamente...");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void RecuperarVehiculos(ArrayList<T> veh) throws FileNotFoundException, ClassNotFoundException{
        try{
            FileInputStream o = new FileInputStream("Vehiculo.dat");
            ObjectInputStream p = new ObjectInputStream(o);
            while(p.readObject() != null){
                veh.add((T)(Vehiculo1)p.readObject());
            }
            for(int i=0;i<veh.size();i++){
                System.out.println((String)veh.get(i).toString());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
