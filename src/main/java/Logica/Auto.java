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
public class Auto extends Vehiculo1{
    int numPasajeros;
    String placa, modelo, marca;

    public int getNumPasajeros() {
        return numPasajeros;
    }
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    //Constructores
    Auto(Date anioFab, int nSer,int peso, int est, double vMax, boolean al, int numPas, String pla, String mod, String mar){
        super(anioFab, nSer, peso, est, vMax, al);
        numPasajeros = numPas;
        placa = pla;
        modelo = mod;
        marca = mar;
    }
    Auto(){
    }
    
    public void Encender(){
        super.Encender();
        System.out.println("\nAuto encendido con exito.");
    }
    public void DistRecorrida(){
        super.DistRecorrida();
    }
    
    public void IngresarDatos(){
        Scanner an = new Scanner(System.in);
        
        super.IngresarDatos();
        System.out.println("Ingrese el numero de pasajeros: ");
        setNumPasajeros(an.nextInt());
        System.out.println("Ingrese la placa del auto: ");
        setPlaca(an.next());
        System.out.println("Ingrese el modelo: ");
        setModelo(an.next());
        System.out.println("Ingrese la mnarca");
        setMarca(an.next());
    }
    
    public void MostrarDatos(){
        super.MostrarDatos();
        
        System.out.println("Tipo de moto: " + getNumPasajeros());
        System.out.println("Tipo de manillar: " + getPlaca());
        System.out.println("Cilindrada" + getMarca());
    }
}
