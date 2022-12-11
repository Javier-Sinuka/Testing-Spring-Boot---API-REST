package com.bazar.bazarAPIREST.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Bazar {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre_roducto;
    private String breve_descripcion_producto;
    private int precio_producto;

    public Bazar(Long id, String nombre_roducto, String breve_descripcion_producto, int precio_producto) {
        this.id = id;
        this.nombre_roducto = nombre_roducto;
        this.breve_descripcion_producto = breve_descripcion_producto;
        this.precio_producto = precio_producto;
    }

    public Bazar() {
    }

    public Long getId() {
        return id;
    }

    public String getNombre_roducto() {
        return nombre_roducto;
    }

    public String getBreve_descripcion_producto() {
        return breve_descripcion_producto;
    }

    public int getPrecio_producto() {
        return precio_producto;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre_roducto(String nombre_roducto) {
        this.nombre_roducto = nombre_roducto;
    }

    public void setBreve_descripcion_producto(String breve_descripcion_producto) {
        this.breve_descripcion_producto = breve_descripcion_producto;
    }

    public void setPrecio_producto(int precio_producto) {
        this.precio_producto = precio_producto;
    }
}
