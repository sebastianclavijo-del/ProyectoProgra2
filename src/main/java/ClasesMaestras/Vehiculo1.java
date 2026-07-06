/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesMaestras;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public abstract class Vehiculo1 {
    protected Date anioFabricacion;
    protected int nroSerie, peso, estacion;
    protected double velocidadMax;
    protected boolean alq;

    public Date getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setAnioFabricacion(Date anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getNroSerie() {
        return nroSerie;
    }
    public void setNroSerie(int nroSerie) {
        this.nroSerie = nroSerie;
    }

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEstacion() {
        return estacion;
    }
    public void setEstacion(int estacion) {
        this.estacion = estacion;
    }
    
    public double getVelocidaMax() {
        return velocidadMax;
    }
    public void setVelocidaMax(double velocidaMax) {
        this.velocidadMax = velocidaMax;
    }

    public boolean getAlq() {
        return alq;
    }
    public void setAlq(boolean alq) {
        this.alq = alq;
    }
    
    public Vehiculo1(Date anioFab, int nSer, int pes, int est, double vMax, boolean al){
        anioFabricacion = anioFab;
        nroSerie = nSer;
        peso = pes;
        estacion = est;
        velocidadMax = vMax;
        alq = al;
    }
    public Vehiculo1(){
    }
    
    public void Encender(){
        int tiempo = 30000, c =5/3000;
        for (int i = 0; i <= 5; i++) {
            int porcentaje = (i * 100) / 5;
            StringBuilder barra = new StringBuilder("[");
            for (int j = 0; j < 5; j++) {
                if (j < i) {
                    barra.append("#");
                } else {
                    barra.append(" ");
                }
            }
        barra.append("]");
        System.out.print("\r" + barra.toString() + " " + porcentaje + "%");
            try{
                Thread.sleep(c);
            } catch(InterruptedException e){
                System.err.println("\nEl encendido fue interrumpido.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
    
    public void DistRecorrida(){
        double velmedia, respiso = 0.438, dist;
        int durBateria = 450000;
        velmedia = velocidadMax/(1 + Math.log(1 + (velocidadMax/respiso)));
        dist = durBateria*(1-(velmedia/velocidadMax));
    }
    
    public void IngresarDatos(){
        Scanner an = new Scanner(System.in);
        
        System.out.println("Ingrese el anio de Fabricacion: ");
        //setAnioFabricacion(an.next());
        System.out.println("Ingrese el numero de serie: ");
        setNroSerie(an.nextInt());
        System.out.println("Ingrese el peso del vehiculo: ");
        setPeso(an.nextInt());
        System.out.println("Ingrese la estacion de partida: ");
        setEstacion(an.nextInt());
        System.out.println("Ingrese la velocidad maxima: ");
        setVelocidaMax(an.nextDouble());
        System.out.println("¿El vehiculo esta siendo alquilado? (0:no/1:si): ");
        setAlq(an.nextBoolean());
    }
    
    public void MostrarDatos(){
        System.out.println("Año de fabricacion: " + getAnioFabricacion());
        System.out.println("Numero de serie: " + getNroSerie());
        System.out.println("Peso: " + getPeso());
        System.out.println("Estacion de inicio: " + getEstacion());
        System.out.println("Velocidad maxima: " + getVelocidaMax());
        System.out.println("¿Esta alquilada?: " + EscribirBooleanos(getAlq()));
    }
    
    public String EscribirBooleanos(boolean bool){
        if (bool == true){
           return "Si";
        } else{
           return "No";
        }
    }
    
    public boolean isAlq() {
        return alq;
    }

}
