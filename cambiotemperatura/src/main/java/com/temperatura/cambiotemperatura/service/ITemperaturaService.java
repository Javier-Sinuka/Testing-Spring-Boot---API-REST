package com.temperatura.cambiotemperatura.service;

import com.temperatura.cambiotemperatura.model.Temperatura;

import java.util.List;

public interface ITemperaturaService {
    public List <Temperatura> getTemperaturas();

    public void saveTemperatura(Temperatura temperatura);

    public void deleteTemperatura(Long id);
}
