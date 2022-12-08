package com.manejo_fecha.manejo_fecha.service;

import com.manejo_fecha.manejo_fecha.model.EdadActual;
import com.manejo_fecha.manejo_fecha.repository.EdadActualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdadActualService implements IEdadActualService{
    @Autowired
    private EdadActualRepository edadActualRepository;

    @Override
    public List<EdadActual> getEdadesRegistradas(){
        List<EdadActual> edadActual = edadActualRepository.findAll();
        return edadActual;
    }

    @Override
    public void saveEdadActual(EdadActual edadActual){
        edadActualRepository.save(edadActual);
    }

    @Override
    public void deleteEdadActual(Long id){
        edadActualRepository.deleteById(id);
    }
}
