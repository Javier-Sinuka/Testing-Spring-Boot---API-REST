package com.temperatura.cambiotemperatura.service;

import com.temperatura.cambiotemperatura.model.Temperatura;
import com.temperatura.cambiotemperatura.repository.TemperaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemperaturaService implements ITemperaturaService {
    @Autowired
    private TemperaturaRepository temperaturaRepository;

    @Override
    public List<Temperatura> getTemperaturas(){
        List<Temperatura> temperaturaEnCuestion = temperaturaRepository.findAll();
        return temperaturaEnCuestion;
    }

    @Override
    public void saveTemperatura(Temperatura temperatura){
        temperaturaRepository.save(temperatura);
    }

    @Override
    public void deleteTemperatura(Long id){
        temperaturaRepository.deleteById(id);
    }
}
