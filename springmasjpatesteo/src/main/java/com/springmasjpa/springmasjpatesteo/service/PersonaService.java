package com.springmasjpa.springmasjpatesteo.service;

import com.springmasjpa.springmasjpatesteo.model.Persona;
import com.springmasjpa.springmasjpatesteo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private PersonaRepository persoRepository;

    @Override
    public List<Persona> getPersona(){
        List<Persona> listaPersonas = persoRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona persona){
        persoRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id){
        persoRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id){
        //aca si no encuentra la persona, devuelvo null por eso el orElse
        Persona persona = persoRepository.findById(id).orElse(null);
        return persona;
    }
}
