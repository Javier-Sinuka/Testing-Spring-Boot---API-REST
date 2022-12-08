package com.springmasjpa.springmasjpatesteo.controller;

import com.springmasjpa.springmasjpatesteo.model.Persona;
import com.springmasjpa.springmasjpatesteo.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService interPersona;

    @GetMapping ("/personas/traer")
    public List<Persona> getPersonas(){
        return interPersona.getPersona();
    }

    @PostMapping ("/personas/crear")
    public String createStudent(@RequestBody Persona persona){
        interPersona.savePersona(persona);
        //devuelve un string avisando si creo correctamente
        return "La persona fue creada correctamente";
    }

    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona (@PathVariable Long id){
        interPersona.deletePersona(id);
        //aviso que se elimino correctamente
        return "La persona fue eliminada correctamente";
    }

    @PutMapping ("personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam ("nombre") String nuevoNombre,
                               @RequestParam ("apellido") String nuevoApellido,
                               @RequestParam ("edad") int nuevaEdad){
        //busco la persona en cuestion
        Persona persona = interPersona.findPersona(id);

        //esto tambien puede ir en service, para desacoplar mejor aun el codigo en un nuevo metodo
        persona.setApellido(nuevoApellido);
        persona.setNombre(nuevoNombre);
        persona.setEdad(nuevaEdad);

        interPersona.savePersona(persona);
        return persona;
    }
}
