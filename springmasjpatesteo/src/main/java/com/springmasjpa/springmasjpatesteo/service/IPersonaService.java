package com.springmasjpa.springmasjpatesteo.service;

import com.springmasjpa.springmasjpatesteo.model.Persona;

import java.util.List;

public interface IPersonaService {
    //metodo para traer todas las personas
    public List<Persona> getPersona();

    //metodo para dar de alta a una persona
    public void savePersona(Persona persona);

    //metodo para borrar a una persona
    public void deletePersona(Long id);

    //metodo para encontrar una persona
    public Persona findPersona(Long id);
}
