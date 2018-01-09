/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import estacionamiento.TicketPantalla;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Mercedes
 */
public class Ticket {
    
    private String fecha;
    private String horaEntrada;
    private String horaSalida;
    private int numero;
    private Ascensor subeEn;
    private Vehiculo perteneceA;
    private Plaza estacionadoEn;
    
    
    public Ticket() {
    }

    public Ticket(String fecha, String horaEntrada, String horaSalida, int numero) {
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.numero = numero;
    }


    
    public Vehiculo getPerteneceA() {
        return perteneceA;
    }

    public void setPerteneceA(Vehiculo perteneceA) {
        this.perteneceA = perteneceA;
    }

    
    public Ascensor getSubeEn() {
        return subeEn;
    }

    public void setSubeEn(Ascensor subeEn) {
        this.subeEn = subeEn;
        
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Plaza getEstacionadoEn() {
        return estacionadoEn;
    }

    public void setEstacionadoEn(Plaza estacionadoEn) {
        this.estacionadoEn = estacionadoEn;
    }
    
    
    public static float CalcularTotal(Ticket t){
        float pago=0;
        long tiempo=0;
        try {
            SimpleDateFormat hora= new SimpleDateFormat("HH:mm");
            Date hE = hora.parse(t.getHoraEntrada());
            System.out.println(hE);
            Date hS = hora.parse(t.getHoraSalida());
            System.out.println(hS);
            if(hS.getTime()<hE.getTime()){
                tiempo= ((hS.getTime())/(1000*60) + 1440 )- hE.getTime()/(1000*60);
            }else{
                tiempo = hS.getTime()/(1000*60)-hE.getTime()/(1000*60);
            }
            
            if(tiempo%60==0){
                pago= (tiempo/60)*t.getPerteneceA().getTarifa();
            }else{
                pago= ((tiempo/60)+1)*t.getPerteneceA().getTarifa();
            }
            
            
            
            //System.out.println(tiempo);
       } catch (ParseException ex) {
            Logger.getLogger(TicketPantalla.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pago;
    }
    
}
