/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import estacionamiento.Estacionamiento;

/**
 *
 * @author Mercedes
 */
public abstract class Vehiculo {
    
    protected String patente;
    protected float tarifa;

    public Vehiculo() {
    }

    public Vehiculo(String patente) {
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }
    
    /**
     *
     * @param t
     * @param tipoSeleccionado
     */
    public static void eliminarVehiculo(Ticket t,String tipoSeleccionado, Vehiculo aRetirar){
       
        if(tipoSeleccionado == "AUTO"){
       
                    Estacionamiento.getAutos().remove(aRetirar);
                    //System.out.println("Eliminado");
               
        }else{
            if(tipoSeleccionado=="CAMIONETA"){
                        Estacionamiento.getCamionetas().remove(aRetirar);
            }else{
                    
                        Estacionamiento.getMotos().remove(aRetirar);         
        }
        
    }
    }
    
}
