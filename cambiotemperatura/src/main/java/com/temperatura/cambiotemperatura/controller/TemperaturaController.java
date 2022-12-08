package com.temperatura.cambiotemperatura.controller;

import com.temperatura.cambiotemperatura.model.Temperatura;
import com.temperatura.cambiotemperatura.service.ITemperaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TemperaturaController {

    @Autowired
    private ITemperaturaService interTemperatura;

    @GetMapping ("/temperatura/traer")
    public List<Temperatura> getTemperaturas(){
        return interTemperatura.getTemperaturas();
    }

    @PostMapping ("/temperatura/ingresar")
    public String ingresarTemperatura(@RequestBody Temperatura temperatura){
        int acumulador = temperatura.getTemperatura();
        interTemperatura.saveTemperatura(temperatura);
        deleteTemperaturaSinTexto(temperatura.getId());
        int conversor = acumulador - 32;
        return "La conversion de " + acumulador + " Faranheit es " + conversor + " Celcius";
    }

    @DeleteMapping ("/temperatura/borrar/{id}")
    public void deleteTemperaturaSinTexto(@PathVariable Long id){
        interTemperatura.deleteTemperatura(id);
    }

}