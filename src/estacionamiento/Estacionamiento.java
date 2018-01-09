/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import clases.Ascensor;
import clases.Auto;
import clases.Camioneta;
import clases.EstadoAscensor;
import clases.EstadoPlaza;
import clases.Moto;
import clases.Planta;
import clases.Plaza;
import clases.Ticket;

import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author Bianca Sozzi
 */
public class Estacionamiento {

    /**
     * @param args the command line arguments
     */
    
   
    private static int numTicket=0;
    //Simular Base de Datos Vehiculos
    private static ArrayList<Auto> autos= new ArrayList ();
    private static ArrayList<Camioneta> camionetas = new ArrayList ();
    private static ArrayList<Moto> motos = new ArrayList();
    private static ArrayList<Ascensor> ascensores = new ArrayList();
    private static ArrayList<Ticket> tickets = new ArrayList();
    private static ArrayList<Planta> plantas = new ArrayList();
    private static ArrayList ascensoreshab = new ArrayList();
    
    //Estados ascensores
    private static EstadoAscensor ea1 = new EstadoAscensor("libre");
    private static EstadoAscensor ea2 = new EstadoAscensor("ocupado");
    private static EstadoAscensor ea3 = new EstadoAscensor("Fuera de Servicio");
    
    private static EstadoPlaza estadoPlazaLibre = new EstadoPlaza("libre");
    private static EstadoPlaza estadoPlazaOcupada = new EstadoPlaza("ocupada");
    
    public static ArrayList<Auto> getAutos() {
        return autos;
    }

    public static void setAutos(ArrayList<Auto> autos) {
        Estacionamiento.autos = autos;
    }

    public static ArrayList<Camioneta> getCamionetas() {
        return camionetas;
    }

    public static void setCamionetas(ArrayList<Camioneta> camionetas) {
        Estacionamiento.camionetas = camionetas;
    }

    public static ArrayList<Moto> getMotos() {
        return motos;
    }

    public static void setMotos(ArrayList<Moto> motos) {
        Estacionamiento.motos = motos;
    }

    public static void addAuto(Auto a){
        autos.add(a);
    }
    
    public static void addCamioneta (Camioneta c){
        camionetas.add(c);
    }
    
    public static void addMoto (Moto m){
        motos.add(m);
    }
   
    //Simular Base de Datos Planta, Plazas y sus estados 
    public static void addPlanta(Planta p){
        plantas.add(p);
    }

    public static ArrayList<Planta> getPlantas() {
        return plantas;
    }

    public static void setPlantas(ArrayList<Planta> plantas) {
        Estacionamiento.plantas = plantas;
    }

    public static EstadoPlaza getEstadoPlazaLibre() {
        return estadoPlazaLibre;
    }

    public static void setEstadoPlazaLibre(EstadoPlaza estadoPlazaLibre) {
        Estacionamiento.estadoPlazaLibre = estadoPlazaLibre;
    }

    public static EstadoPlaza getEstadoPlazaOcupada() {
        return estadoPlazaOcupada;
    }

    public static void setEstadoPlazaOcupada(EstadoPlaza estadoPlazaOcupada) {
        Estacionamiento.estadoPlazaOcupada = estadoPlazaOcupada;
    }
    
    
     //Simular Base de Datos Ascensores y sus estados

    public static ArrayList<Ascensor> getAscensores() {
        return ascensores;
    }

    public static void setAscensores(ArrayList<Ascensor> ascensores) {
        Estacionamiento.ascensores = ascensores;
    }

    public static ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public static void setTickets(ArrayList<Ticket> tickets) {
        Estacionamiento.tickets = tickets;
    }
    public static void addTicket (Ticket t){
        t.setNumero(numTicket+1);
        tickets.add(t);
        numTicket += 1;
        //System.out.println(t.getNumero());
    }

    public static EstadoAscensor getEa1() {
        return ea1;
    }

    public static void setEa1(EstadoAscensor ea1) {
        Estacionamiento.ea1 = ea1;
    }

    public static EstadoAscensor getEa2() {
        return ea2;
    }

    public static void setEa2(EstadoAscensor ea2) {
        Estacionamiento.ea2 = ea2;
    }

    public static EstadoAscensor getEa3() {
        return ea3;
    }

    public static void setEa3(EstadoAscensor ea3) {
        Estacionamiento.ea3 = ea3;
    }

    public static ArrayList getAscensoreshab() {
        return ascensoreshab;
    }

    public static void setAscensoreshab(ArrayList ascensoreshab) {
        Estacionamiento.ascensoreshab = ascensoreshab;
    }
   
              
    
    public static void main(String[] args) {
        PantallaPrincipal ppal= new PantallaPrincipal();
        ppal.setVisible(true);
    
  
    //Inicializar de plantas con plazas y sus respectivos estados.
    Planta planta1= new Planta (10, 1);
    Planta planta2= new Planta (10, 2);
    Planta planta3= new Planta (10, 3);
    
    
    
            for (int j = 1; j<=30; j++){
                Plaza p= new Plaza(j);
                p.setEsta(Estacionamiento.getEstadoPlazaLibre());
                if(j<=10){
                    planta1.addPlaza(p);
                }else{
                    if(j<=20){
                        planta2.addPlaza(p);
                    }else{
                        planta3.addPlaza(p);
                    }
                }
            }
      /*      
        planta1.mostrarPlazas();
        planta2.mostrarPlazas();
        planta3.mostrarPlazas();
        */
        addPlanta(planta1);
        addPlanta(planta2);
        addPlanta(planta3);
        
        //Inicializar Ascensores

        Ascensor a1 = new Ascensor(1);
        Ascensor a2 = new Ascensor(2);
        Ascensor a3 = new Ascensor(3);
        
        
        a1.setEsta(ea1);
        a2.setEsta(ea3);
        a3.setEsta(ea1);
        
        ascensores.add(a1);
        ascensores.add(a2);
        ascensores.add(a3);
        //System.out.println(a1.getEsta().getNombre());
        
       
        //System.out.println(noche.getHoraDEsde());
        //System.out.println(noche.getHoraHasta());
        
        //Ascensores habilitados
           for(int i = 0; i< ascensores.size(); i++){
            if((ascensores.get(i).getEsta().getNombre()) != getEa3().getNombre()){
                  ascensoreshab.add(ascensores.get(i));
            }
        }
          // System.out.println(ascensoreshab.size());
    }
}
    
