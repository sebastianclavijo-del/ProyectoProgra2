/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.*;

import ClasesMaestras.Vehiculo1;
/**
 *
 * @author USER
 */
public class Camion extends Vehiculo1{
    int numEjes;
    double cargaNeta;
    String tipoRemolque;
    /*
        Tipos de remolque de camion: dry van, frigoríficos, escalonada,
        doble caída y side-kit
    */

    public int getNumEjes() {
        return numEjes;
    }
    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public double getCargaNeta() {
        return cargaNeta;
    }
    public void setCargaNeta(double cargaNeta) {
        this.cargaNeta = cargaNeta;
    }

    public String getTipoRemolque() {
        return tipoRemolque;
    }
    public void setTipoRemolque(String tipoRemolque) {
        this.tipoRemolque = tipoRemolque;
    }
    
    //Constructor
    public Camion(int anioFab, int nSer, int peso, int est, double vMax, boolean al, int nEje, double cNeta, String tRem){
    super(anioFab, nSer, peso, est, vMax, al);
    numEjes = nEje;
    cargaNeta = cNeta;
    tipoRemolque = tRem;
    }
    Camion(){
    }
    
    public void Encender(){
        super.Encender();
        System.out.println("\nCamion encendido con exito.");
    }
    
    public void DistRecorrida(){
        super.DistRecorrida();
    }
    
    public void IngresarDatos(){
        Scanner an = new Scanner(System.in);
        
        super.IngresarDatos();
        
        System.out.println("Ingrese el numero de ejes: ");
        setNumEjes(an.nextInt());
        System.out.println("Ingrese la carga neta: ");
        setCargaNeta(an.nextDouble());
        System.out.println("Ingrese el tipo de remolque: ");
        setTipoRemolque(an.nextLine());
    }
    
    public void MostrarDatos(){
        super.MostrarDatos();
        
        System.out.println("Numero de ejes: " + getNumEjes());
        System.out.println("Carga neta: " + getCargaNeta());
        System.out.println("Tipo de remolque: " + getTipoRemolque());
    }
    
}
