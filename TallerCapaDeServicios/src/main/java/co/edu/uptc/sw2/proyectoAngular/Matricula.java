/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoAngular;

/**
 *
 * @author PEDRO
 */
public class Matricula {

    public Matricula(int annio, int semestre) {
        this.annio = annio;
        this.semestre = semestre;
    }
    
    /**
     * @return the annio
     */
    public int getAnnio() {
        return annio;
    }

    /**
     * @param annio the annio to set
     */
    public void setAnnio(int annio) {
        this.annio = annio;
    }

    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    private int annio;
    private int semestre;
}
