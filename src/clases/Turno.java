/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Time;

/**
 *
 * @author Mercedes
 */
public class Turno {
    private Time horaDEsde;
    private Time horaHasta;
    private String nombre;

    public Turno() {
    }

    public Turno(Time horaDEsde, Time horaHasta, String nombre) {
        this.horaDEsde = horaDEsde;
        this.horaHasta = horaHasta;
        this.nombre = nombre;
    }

    public Time getHoraDEsde() {
        return horaDEsde;
    }

    public void setHoraDEsde(Time horaDEsde) {
        this.horaDEsde = horaDEsde;
    }

    public Time getHoraHasta() {
        return horaHasta;
    }

    public void setHoraHasta(Time horaHasta) {
        this.horaHasta = horaHasta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
