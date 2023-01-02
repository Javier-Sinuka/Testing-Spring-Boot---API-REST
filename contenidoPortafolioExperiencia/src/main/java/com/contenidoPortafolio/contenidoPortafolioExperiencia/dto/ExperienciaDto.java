package com.contenidoPortafolio.contenidoPortafolioExperiencia.dto;



public class ExperienciaDto {
    private String nombreExperiencia;
    private String lugarExperiencia;
    private String modalidadExperiencia;
    private int tiempoExperiencia;
    private String contenidoExperiencia;

    public ExperienciaDto(String nombreExperiencia, String lugarExperiencia, String modalidadExperiencia, int tiempoExperiencia, String contenidoExperiencia) {
        this.nombreExperiencia = nombreExperiencia;
        this.lugarExperiencia = lugarExperiencia;
        this.modalidadExperiencia = modalidadExperiencia;
        this.tiempoExperiencia = tiempoExperiencia;
        this.contenidoExperiencia = contenidoExperiencia;
    }

    public ExperienciaDto() {
    }

    public String getNombreExperiencia() {
        return nombreExperiencia;
    }

    public String getLugarExperiencia() {
        return lugarExperiencia;
    }

    public String getModalidadExperiencia() {
        return modalidadExperiencia;
    }

    public int getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    public String getContenidoExperiencia() {
        return contenidoExperiencia;
    }

    public void setNombreExperiencia(String nombreExperiencia) {
        this.nombreExperiencia = nombreExperiencia;
    }

    public void setLugarExperiencia(String lugarExperiencia) {
        this.lugarExperiencia = lugarExperiencia;
    }

    public void setModalidadExperiencia(String modalidadExperiencia) {
        this.modalidadExperiencia = modalidadExperiencia;
    }

    public void setTiempoExperiencia(int tiempoExperiencia) {
        this.tiempoExperiencia = tiempoExperiencia;
    }

    public void setContenidoExperiencia(String contenidoExperiencia) {
        this.contenidoExperiencia = contenidoExperiencia;
    }
}
