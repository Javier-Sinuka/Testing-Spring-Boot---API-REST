package com.PlatosRestauranteAPI.PlatosRestaurante.service;


import com.PlatosRestauranteAPI.PlatosRestaurante.model.Restaurante;

import java.util.List;
import java.util.Optional;

public interface IRestoService {
    List<Restaurante> getPlatosDisponibles();
    public void saveNewPlato(Restaurante restaurante);
    public void deletePlato(Long id);
    public Restaurante consultaPlatoById(Long id);
}
