package com.manejo_fecha.manejo_fecha.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

@Getter @Setter
@Entity
public class EdadActual {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;
    private String date;

    //DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public EdadActual(Long id, String date) {
        this.id = id;
        this.date = date;
    }

    public EdadActual() {
    }

    public Long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

//    public String muestraEdadActual(String date){
//        LocalDate fechaNac = LocalDate.parse(date,fmt);
//        LocalDate ahora = LocalDate.now();
//
//        Period periodo = Period.between(fechaNac, ahora);
//        return "Tu edad es: " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses y " + periodo.getDays() + " dias.";
//    }
}
