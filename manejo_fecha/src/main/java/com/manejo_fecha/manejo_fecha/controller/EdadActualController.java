package com.manejo_fecha.manejo_fecha.controller;

import com.manejo_fecha.manejo_fecha.model.EdadActual;
import com.manejo_fecha.manejo_fecha.service.IEdadActualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
public class EdadActualController {
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    @Autowired
    private IEdadActualService interEdad;

    @GetMapping ("/edad/traer")
    public List<EdadActual> getEdades(){
        return interEdad.getEdadesRegistradas();
    }

    @PostMapping ("/edad/ingresar_edad")
    public String edadActual(@RequestBody EdadActual edadActual){
        String edad = edadActual.getDate();
        LocalDate fechaNac = LocalDate.parse(edad,fmt);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        return "Tu edad es: " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses y " + periodo.getDays() + " dias.";
    }
}
