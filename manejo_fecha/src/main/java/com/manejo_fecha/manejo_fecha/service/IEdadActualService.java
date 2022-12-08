package com.manejo_fecha.manejo_fecha.service;

import com.manejo_fecha.manejo_fecha.model.EdadActual;

import java.util.List;

public interface IEdadActualService {
    public List<EdadActual> getEdadesRegistradas();
    public void saveEdadActual(EdadActual edadActual);
    public void deleteEdadActual(Long id);
}
