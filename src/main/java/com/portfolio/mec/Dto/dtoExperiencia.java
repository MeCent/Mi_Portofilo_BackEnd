package com.portfolio.mec.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String inicioE;
    @NotBlank
    private String finE;
    @NotBlank
    private String descripcionE;
    
    //Constructores
    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String inicioE, String finE, String descripcionE) {
        this.nombreE = nombreE;
        this.inicioE = inicioE;
        this.finE = finE;
        this.descripcionE = descripcionE;
    }
    
    //Getter y Setters
    public String getNombreE() {
        return nombreE;
    }

    public String getInicioE() {
        return inicioE;
    }

    public void setInicioE(String inicioE) {
        this.inicioE = inicioE;
    }

    public String getFinE() {
        return finE;
    }

    public void setFinE(String finE) {
        this.finE = finE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
}
