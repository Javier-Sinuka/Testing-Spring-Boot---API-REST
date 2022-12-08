package com.inmobiliaria.inmobiliaria.model;

public class Inquilino {
    private Long id_inquilino;
    private String dni;
    private String nombre;
    private String apellido;
    private String profesion;

    public Inquilino(Long id_inquilino, String dni, String nombre, String apellido, String profesion) {
        this.id_inquilino = id_inquilino;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
    }

    public Inquilino() {
    }

    public Long getId_inquilino() {
        return id_inquilino;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setId_inquilino(Long id_inquilino) {
        this.id_inquilino = id_inquilino;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}
