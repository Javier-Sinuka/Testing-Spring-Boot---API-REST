package com.temperatura.cambiotemperatura.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Temperatura {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private int temperatura;

    public Temperatura(Long id, int temperatura) {
        this.id = id;
        this.temperatura = temperatura;
    }

    public Temperatura() {
    }

    public Long getId() {
        return id;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
}
