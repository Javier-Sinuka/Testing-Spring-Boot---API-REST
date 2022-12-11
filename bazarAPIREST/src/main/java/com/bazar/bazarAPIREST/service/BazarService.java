package com.bazar.bazarAPIREST.service;

import com.bazar.bazarAPIREST.model.Bazar;
import com.bazar.bazarAPIREST.repository.BazarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BazarService implements IBazarService{
    @Autowired
    private BazarRepository bazarRepository;

    @Override
    public List<Bazar> getTraerProductos(){
        List<Bazar> listaProductos = bazarRepository.findAll();
        return listaProductos;
    }

    @Override
    public String saveProduct(Bazar bazar){
        bazarRepository.save(bazar);
        return "Producto guardado con Exito.";
    }

    @Override
    public String deletProduct(Long id){
        bazarRepository.deleteById(id);
        return "Producto eliminado con Exito.";
    }

    @Override
    public Bazar findProduct(Long id){
        Optional<Bazar> optionalBazar = bazarRepository.findById(id);
        if(optionalBazar.isPresent()){
            return optionalBazar.get();
        }else {
            return new Bazar();
        }
    }
}
