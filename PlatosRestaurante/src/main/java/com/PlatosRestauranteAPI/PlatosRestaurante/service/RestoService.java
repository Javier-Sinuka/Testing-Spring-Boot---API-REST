package com.PlatosRestauranteAPI.PlatosRestaurante.service;

import com.PlatosRestauranteAPI.PlatosRestaurante.model.Restaurante;
import com.PlatosRestauranteAPI.PlatosRestaurante.repository.RestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestoService implements IRestoService{
    @Autowired
    private RestoRepository restoRepository; //Creamos un centro de almacenaje momentaneo
    //para las variables, que despues conectaremos con la BDD

    @Override //Los metodos son Override siempre
    public List<Restaurante> getPlatosDisponibles(){ // Metodos publicos
        List<Restaurante> listaPlatosDisponibles = restoRepository.findAll();
        return listaPlatosDisponibles;
    }

    @Override
    public void saveNewPlato(Restaurante restaurante){
        restoRepository.save(restaurante);
    }

    @Override
    public void deletePlato(Long id){
        restoRepository.deleteById(id);
    }

    @Override
    public Restaurante consultaPlatoById(Long id){ //Metodo para retornar un
        //id especifico
        Optional<Restaurante> optConsult = restoRepository.findById(id);
        if (optConsult.isPresent()){
            return optConsult.get();
        }else{
            return new Restaurante();
        }
    }
}
