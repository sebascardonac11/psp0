/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.PSP0.app;

import java.util.LinkedList;

/**
 *Clase utilizada para realizar la lógica matematica para realizar los calculos.
 * @author sebascardonac11
 */
public class psp0 {

    private final LinkedList dataI;
    private final double media;
    private double sumatoria;
    private double varianza;
    private final double desviacion;
    /**
     * 
     * @param in Lista con los valores a calcular, no se realizan validaciones de los datos.
     */
    public psp0(LinkedList in) {
        this.dataI = in;
        for (Object dataI1 : this.dataI) {
            this.sumatoria += ((Double) dataI1);
        }
        this.media = sumatoria / this.dataI.size();
        for (Object dataI1 : this.dataI) {
            double rango;
            rango = Math.pow(((Double) dataI1) - media, 2);
            this.varianza = this.varianza + rango;
        }
        this.varianza = this.varianza / (this.dataI.size()-1);
        desviacion = Math.sqrt(varianza);
    }

    /**
     * @return the media
     */
    public double getMedia() {
        return media;
    }

    /**
     * @return the varianza
     */
    public double getVarianza() {
        return varianza;
    }

    /**
     * @return the desviacion
     */
    public double getDesviacion() {
        return desviacion;
    }

    

}
