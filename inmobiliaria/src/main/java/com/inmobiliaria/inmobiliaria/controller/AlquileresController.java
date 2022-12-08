package com.inmobiliaria.inmobiliaria.controller;

import com.inmobiliaria.inmobiliaria.dto.PropiedadDTO;
import com.inmobiliaria.inmobiliaria.model.Inquilino;
import com.inmobiliaria.inmobiliaria.model.Propiedad;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlquileresController {

    @GetMapping ("/propiedad/{id}")
    public PropiedadDTO devolverPropiedad(@PathVariable Long id){
        //supongamos que obtenemos una propiedad por su id y su inquilino desde una BDD
        Inquilino inqui = new Inquilino(1L, "12345", "Javier", "String", "Ingeniero");
        Propiedad prop = new Propiedad(1234123L, "Casa", "1800 Colon", 200.0, 40000.0);
        PropiedadDTO propiDTO = new PropiedadDTO();

        //Unificamos los datos del inquilino y de la propiedad en un solo objeto
        propiDTO.setId_propiedad(prop.getId_propiedad());
        propiDTO.setTipo(prop.getTipo_propiedad());
        propiDTO.setDireccion(prop.getDireccion());
        propiDTO.setValor_alquiler(prop.getValor_alquiler());
        propiDTO.setNombre_inquilino(inqui.getNombre());
        propiDTO.setApellido_inquilino(inqui.getApellido());

        return propiDTO;
    }
}
