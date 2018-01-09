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
public class Plaza {
    private int numero;
    private EstadoPlaza esta;

    public Plaza() {
    }
    
    public Plaza(int numero) {
        this.numero = numero;
    }
    
    
    public EstadoPlaza getEsta() {
        return esta;
    }

    public void setEsta(EstadoPlaza esta) {
        this.esta = esta;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
      public void AsignarPlaza(Ticket ticket){
        for(int i = 0; i< Estacionamiento.getPlantas().size(); i++){
            Planta planta= Estacionamiento.getPlantas().get(i);
                for(int j = 0; j< planta.getContiene().size(); j++){
                    Plaza plaza = planta.getContiene().get(j);
                    System.out.println(plaza.getNumero());
                    if(plaza.getEsta().getNombre().equals("libre")){
                        j= planta.getContiene().size();
                        i= Estacionamiento.getPlantas().size();
                        ticket.setEstacionadoEn(plaza);
                        System.out.println("estacionado en:" + ticket.getEstacionadoEn().getNumero());
                        plaza.setEsta(Estacionamiento.getEstadoPlazaOcupada());
                        System.out.println(plaza.getEsta().getNombre());
                    }
                }
        
        }
    }
}
