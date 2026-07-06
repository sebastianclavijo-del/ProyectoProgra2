package Logica;

import ClasesMaestras.Vehiculo1;
import ClasesMaestras.Persona1;
/**
 *
 * @author USER
 */
public class Alquiler {
    Vehiculo1 veh;
    Persona1 cli;
    int estacionfinal;      
    int tipoPago;
    
    Alquiler(Vehiculo1 v, Persona1 p, int ef, int tp){
        this.veh = v;
        this.cli = p;
        this.estacionfinal = ef;
        this.tipoPago = tp;
    }
    Alquiler(){
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
