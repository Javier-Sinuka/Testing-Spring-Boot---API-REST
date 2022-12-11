package com.PlatosRestauranteAPI.PlatosRestaurante.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter @Setter
@Entity
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //Super importante que el id sera incremental papa
    private Long id;
    private String nombre_plato;
    private int precio_plato;
    private String bdescripcion_plato;

    public Restaurante(Long id, String nombre_plato, int precio_plato, String bdescripcion_plato) {
        this.id = id;
        this.nombre_plato = nombre_plato;
        this.precio_plato = precio_plato;
        this.bdescripcion_plato = bdescripcion_plato;
    }

    public Restaurante() {
    }

    public Long getId() {
        return id;
    }

    public String getNombre_plato() {
        return nombre_plato;
    }

    public int getPrecio_plato() {
        return precio_plato;
    }

    public String getBdescripcion_plato() {
        return bdescripcion_plato;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre_plato(String nombre_plato) {
        this.nombre_plato = nombre_plato;
    }

    public void setPrecio_plato(int precio_plato) {
        this.precio_plato = precio_plato;
    }

    public void setBdescripcion_plato(String bdescripcion_plato) {
        this.bdescripcion_plato = bdescripcion_plato;
    }
}
