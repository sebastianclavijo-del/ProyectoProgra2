/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MovTransaccionales;

import Logica.Nodo;
import Logica.Alquiler;


public class ContenedorAlquiler {
    Nodo cab;
    
    public ContenedorAlquiler(){
        cab = null;
    }
    
    public Nodo getCab() {              
        return cab;
    }
    public void setCab(Nodo cab) {      
        this.cab = cab;
    }   
    public void AgregarAlquiler(Alquiler dato){
        Nodo n = new Nodo();
        n.dato = dato;
        n.sig = null;
        if(cab == null){
            cab = n;
        } else{
            Nodo actual = cab;
            while(actual.sig != null){
                actual = actual.sig;
            }
            actual.sig = n;
        }
    }
    
    public void MostrarAlquiler(){
        Nodo actual = cab; 
        
        if(cab == null){
            System.out.println("La lista de alquileres esta vacia...");
        } else {
            while(actual != null){
                System.out.println(actual.dato.toString());
                actual = actual.sig; 
            }
        }
    }
    
    public void  EliminarAlquiler(Alquiler alq){
        Nodo actual = new Nodo();
        if(cab == null){
            System.out.println("La lista de alquileres esta vacia...");
        }else{
            while(actual.sig != null && !actual.sig.dato.equals(alq)){
                actual = actual.sig;
            }
        }
        if(actual.sig != null){
            actual.sig = actual.sig.sig;
        }
    }
}
