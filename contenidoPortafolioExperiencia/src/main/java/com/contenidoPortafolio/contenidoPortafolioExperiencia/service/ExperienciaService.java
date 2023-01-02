package com.contenidoPortafolio.contenidoPortafolioExperiencia.service;

import com.contenidoPortafolio.contenidoPortafolioExperiencia.model.Experiencia;
import com.contenidoPortafolio.contenidoPortafolioExperiencia.repository.ExperienciaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ExperienciaService {
    @Autowired
    ExperienciaRepository experienciaRepository;

    public List<Experiencia> list(){
        return experienciaRepository.findAll();
    }

    public Optional<Experiencia> getOne(long id){
        return experienciaRepository.findById(id);
    }

    public void save(Experiencia experiencia){
        experienciaRepository.save(experiencia);
    }

    public void delete(long id){
        experienciaRepository.deleteById(id);
    }

    public boolean existsById(long id){
        return experienciaRepository.existsById(id);
    }

}
