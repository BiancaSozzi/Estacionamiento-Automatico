/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Mercedes
 */
public class Planta {
    
    private int capacidad;
    private int numero;
    private ArrayList<Plaza> contiene = new ArrayList();
    

    public Planta() {
    }
    
    public Planta(int capacidad, int numero) {
        this.capacidad = capacidad;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    public void addPlaza(Plaza p){
       contiene.add(p);
    }

    public ArrayList<Plaza> getContiene() {
        return contiene;
    }

    public void setContiene(ArrayList<Plaza> contiene) {
        this.contiene = contiene;
    }
    /*
    public void mostrarPlazas(){
       // for (int i=1; i<=contiene.size(); i++){
       //     System.out.println(contiene.get(i).getNumero());
       
        System.out.println("plazas" + contiene.size());
        System.out.println("primero" + contiene.get(0).getNumero());
        System.out.println("ultimo" + contiene.get(9).getNumero());
     
        
    }*/
    
 
}
