package com.inmobiliaria.inmobiliaria.dto;

public class PropiedadDTO {
    private Long id_propiedad;
    private String tipo;
    private String direccion;
    private Double valor_alquiler;
    private String nombre_inquilino;
    private String apellido_inquilino;

    public PropiedadDTO(Long id_propiedad, String tipo, String direccion, Double valor_alquiler, String nombre_inquilino, String apellido_inquilino) {
        this.id_propiedad = id_propiedad;
        this.tipo = tipo;
        this.direccion = direccion;
        this.valor_alquiler = valor_alquiler;
        this.nombre_inquilino = nombre_inquilino;
        this.apellido_inquilino = apellido_inquilino;
    }

    public PropiedadDTO() {
    }

    public Long getId_propiedad() {
        return id_propiedad;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public Double getValor_alquiler() {
        return valor_alquiler;
    }

    public String getNombre_inquilino() {
        return nombre_inquilino;
    }

    public String getApellido_inquilino() {
        return apellido_inquilino;
    }

    public void setId_propiedad(Long id_propiedad) {
        this.id_propiedad = id_propiedad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setValor_alquiler(Double valor_alquiler) {
        this.valor_alquiler = valor_alquiler;
    }

    public void setNombre_inquilino(String nombre_inquilino) {
        this.nombre_inquilino = nombre_inquilino;
    }

    public void setApellido_inquilino(String apellido_inquilino) {
        this.apellido_inquilino = apellido_inquilino;
    }
}
