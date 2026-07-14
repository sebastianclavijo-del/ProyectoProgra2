package Logica;

import ClasesMaestras.Vehiculo1;
import ClasesMaestras.Persona1;
import java.io.Serializable;
/**
 *
 * @author USER
 */
public class Alquiler implements Serializable{
    Vehiculo1 veh;
    Persona1 cli;
    int estacionfinal;      
    int tipoPago;
    String fechaInicio;
    String fechaFin = "-";
            
    
    Alquiler(Vehiculo1 v, Persona1 p, int ef, int tp){
        this.veh = v;
        this.cli = p;
        this.estacionfinal = ef;
        this.tipoPago = tp;
    }
    
    public Alquiler(Vehiculo1 v, Persona1 p, String fechaInicio){
        this.veh = v;
        this.cli = p;
        this.fechaInicio = fechaInicio;
    }
    
    
    Alquiler(){
    }
    
    public ClasesMaestras.Vehiculo1 getVeh() {
        return veh;
    }

    public ClasesMaestras.Persona1 getCli() {
        return cli;
    }
    
    public String getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isActivo() {
        return fechaFin == null || fechaFin.equals("-");
    }
    public boolean CrearAlquiler(){
        if(veh.getEstacion() != estacionfinal || veh.getAlq() == true){
            return false;
        }else{
            return true;
        }
    }
    
    
    @Override
    public String toString(){
        return "Vehiculo: "+veh.getNroSerie()+ " Cliente: " + 
                cli + "Estacion de partida: "+ 
                veh.getEstacion() + " Estacion final: "+
                estacionfinal + " Tipo de Pago: " + tipoPago +"\n";
    }
    
}
