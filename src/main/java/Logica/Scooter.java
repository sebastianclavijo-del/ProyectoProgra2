/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Date;
import java.util.Scanner;

import ClasesMaestras.Vehiculo1;

/**
 *
 * @author USER
 */
public class Scooter extends Vehiculo1 implements VehElectrico{
    boolean plegable, Bluetooth;
    double diametroRuedas;
    int porcBateria;
    String marca;

    public boolean getPlegable() {
        return plegable;
    }
    public void setPlegable(boolean plegable) {
        this.plegable = plegable;
    }

    public boolean getBluetooth() {
        return Bluetooth;
    }
    public void setBluetooth(boolean Bluetooth) {
        this.Bluetooth = Bluetooth;
    }

    public double getDiametroRuedas() {
        return diametroRuedas;
    }
    public void setDiametroRuedas(double diametroRuedas) {
        this.diametroRuedas = diametroRuedas;
    }

    public int getPorcBateria() {
        return porcBateria;
    }

    public void setPorcBateria(int porcBateria) {
        this.porcBateria = porcBateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //Constructor
    Scooter(Date anioFab, int nSer,int peso, int est, double vMax, boolean al, boolean ple, boolean blue, double diam, String marca){
        super(anioFab, nSer, peso, est, vMax, al);
        plegable = ple;
        Bluetooth = blue;
        diametroRuedas = diam;
        marca = marca; 
    }
    Scooter(){
    }
    
    public void Encender(){
        super.Encender();
        System.out.println("\nScooter encendido con exito.");
    }
    
    public void DistRecorrida(){
        super.DistRecorrida();
    }
    
    
    public void IngresarDatos(){
        Scanner an = new Scanner(System.in);
        
        super.IngresarDatos();
        
        System.out.println("¿El scooter es plegable?: ");
        setPlegable(an.nextBoolean());
        System.out.println("¿El scooter posee conectividad bluetooth?: ");
        setBluetooth(an.nextBoolean());
        System.out.println("Ingrese el diametro de ruedas(en cm): ");
        setDiametroRuedas(an.nextDouble());
    }
    
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("¿El scooter es plegable?: " + super.EscribirBooleanos(getPlegable()));
        System.out.println("¿El scooter posee conectividad bluetooth?: " + EscribirBooleanos(getBluetooth()));
        System.out.println("Diametro de ruedas: " + getDiametroRuedas());
    }
    
    @Override
    public void CargaVElectrico(){
        for (int i = 0; i <= 10; i++) {
            int porcentaje = (i * 100) / 10;
            StringBuilder barra = new StringBuilder("[");
            for (int j = 0; j < 10; j++) {
                if (j < i) {
                    barra.append("#");
                } else {
                    barra.append(" ");
                }
            }
        barra.append("]");

        // \r regresa el cursor al inicio de la línea actual
        System.out.print("\r" + barra.toString() + " " + porcentaje + "%");
            try{
                Thread.sleep(5000);
            } catch(InterruptedException e){
                System.err.println("\nEl encendido fue interrumpido.");
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println("\nVehiculo encendido con exito.");
    }
    
    @Override
    public void VerBateriaRestante(){
        int bat = 100 - porcBateria;
        System.out.println("Queda " + bat + " % restante");
    }
    
    @Override
    public void DistanciaRestante(){
        double velmedia, respiso = 0.438, distRest;
        int durBateria = 450000;
        velmedia = velocidadMax/(1 + Math.log(1 + (velocidadMax/respiso)));
        distRest = durBateria/((velmedia/velocidadMax)*100);
    }
    
}
