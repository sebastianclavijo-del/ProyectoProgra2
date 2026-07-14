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
public class Bicicleta extends Vehiculo1 implements VehElectrico{
    boolean tipoMotor, pantalla;
    int tipo, porcBateria;

    public boolean getTipoMotor() {
        return tipoMotor;
    }
    public void setTipoMotor(boolean tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public boolean getPantalla() {
        return pantalla;
    }
    public void setPantalla(boolean pantalla) {
        this.pantalla = pantalla;
    }

    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getPorcBateria() {
        return porcBateria;
    }

    public void setPorcBateria(int porcBateria) {
        this.porcBateria = porcBateria;
    }
    
    //Constructor
    public Bicicleta(int anioFab, int nSer, int peso, int est, double vMax, boolean al, boolean tipoMot, boolean pan, int tip){
    super(anioFab, nSer, peso, est, vMax, al);
    tipoMotor = tipoMot;
    pantalla = pan;
    tipo = tip;
    }
    
    Bicicleta(){
    }
    
    @Override
    public void Encender(){
        super.Encender();
        System.out.println("\nBicicleta encendida con exito.");
    }
    
    public void DistRecorrida(){
        super.DistRecorrida();
    }
    
    public void IngresarDatos(){
        Scanner an = new Scanner(System.in);
        
        super.IngresarDatos();
        
        System.out.println("¿La bicicleta cuenta con motor?: ");
        setTipoMotor(an.nextBoolean());
        System.out.println("¿La bicicleta cuenta con pantalla?: ");
        setPantalla(an.nextBoolean());
        System.out.println("Ingrese el tipo de bicicleta): ");
        setTipo(an.nextInt());
    }
    
    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        
        System.out.println("¿El scooter es plegable?: " + super.EscribirBooleanos(getTipoMotor()));
        System.out.println("¿El scooter posee conectividad bluetooth?: " + EscribirBooleanos(getPantalla()));
        System.out.println("Tipo de bicicleta: " + EscribirTipo(getTipo()));
    }
     
    public String EscribirTipo(int tipo){
        String bici;
        bici = switch (tipo) {
            case 1 -> "Montaña";
            case 2 -> "Carretera";
            case 3 -> "Gravel";
            case 4 -> "Urbana";
            default -> "null";
        };
        return bici;
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
