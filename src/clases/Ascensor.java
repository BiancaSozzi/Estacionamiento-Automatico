/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import estacionamiento.Estacionamiento;
import java.util.ArrayList;



/**
 *
 * @author Mercedes
 */
public class Ascensor {
    private int numero;
    private static int cnt = 0;
    EstadoAscensor esta;

    public Ascensor() {
    }

    
    public Ascensor(int numero) {
        this.numero = numero;
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public EstadoAscensor getEsta() {
        return esta;
    }

    public void setEsta(EstadoAscensor esta) {
        this.esta = esta;
    
    }
     public void AsignarAscensor(Ticket ticket){
        for(int i = 0; i < Estacionamiento.getAscensores().size(); i++){
                Ascensor asc = Estacionamiento.getAscensores().get(i);
                if(asc.getEsta().getNombre().equals("libre")){
                    ticket.setSubeEn(asc);
                    System.out.println("sube en:"+ticket.getSubeEn().getNumero());
                    i= Estacionamiento.getAscensores().size();
                    asc.setEsta(Estacionamiento.getEa2());
                }
        }
    }
     
     public static void mantenerOcupado(){
        ArrayList<Ascensor> ascensores = Estacionamiento.getAscensores();
        ArrayList ascensoreshab = Estacionamiento.getAscensoreshab();
        System.out.println("mantenerOcupado");
        cnt += 1;
        if(cnt == ascensoreshab.size()){
            for(int i = 0; i < ascensores.size(); i++){
                if(ascensores.get(i).getEsta().getNombre().equals("ocupado")){
                    //System.out.println("Entro a if");
                    ascensores.get(i).setEsta(Estacionamiento.getEa1());
                }
            }
            cnt=0;
        }
    }
}
     
    

