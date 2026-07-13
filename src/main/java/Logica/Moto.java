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
public class Moto extends Vehiculo1{
    int tipo, manillar,cilindrada;
    /*
    Tipos de moto: estandar(1), cruiser(2), deportivo(3),
    off-road(4), doble proposito(5)
    Tipos de manillar: recto(1), riser(2), clip-on(3)
    */

    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getManillar() {
        return manillar;
    }
    public void setManillar(int manillar) {
        this.manillar = manillar;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    //Constructor
    public Moto(int anioFab, int nSer, int peso, int est, double vMax, boolean al, int tip, int man, int cil){
    super(anioFab, nSer, peso, est, vMax, al);
    tipo = tip;
    manillar = man;
    cilindrada = cil;
    }
    Moto(){
    }
    
    public void Encender(){
        super.Encender();
        System.out.println("\nMoto encendida con exito.");
    }
    
    public void DistRecorrida(){
        super.DistRecorrida();
    }
    
    
    public void IngresarDatos(){
        Scanner an = new Scanner(System.in);
        
        super.IngresarDatos();
        
        System.out.println("Ingrese el tipo de moto: ");
        setTipo(an.nextInt());
        System.out.println("Ingrese el tipo de manillar: ");
        setManillar(an.nextInt());
        System.out.println("Ingrese la cilindrada de la moto: ");
        setCilindrada(an.nextInt());
    }
    
    public void MostrarDatos(){
        super.MostrarDatos();
        
        System.out.println("Tipo de moto: " + EscribirTipoMoto(getTipo()));
        System.out.println("Tipo de manillar: " + EscribirManillar(getManillar()));
        System.out.println("Cilindrada" + getCilindrada());
    }
    
    public String EscribirTipoMoto(int tipo){
        String cad;
        switch (tipo){
            case 1: cad ="Estándar"; break;
            case 2: cad = "Cruiser"; break;
            case 3: cad = "Deportivo"; break;
            case 4: cad = "Off-road"; break;
            case 5: cad = "Doble propósito"; break;
            default: cad = null; break;
        }
        return cad;
    }
    
    public String EscribirManillar(int manil){
        String man;
        switch (manil){
            case 1: man = "Recto"; break;
            case 2: man = "Riser"; break;
            case 3: man = "Clip-on"; break;
            default: man = null; break;
        }
        return man;
    }
}
