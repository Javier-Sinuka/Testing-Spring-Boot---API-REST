package com.bazar.bazarAPIREST.service;

import com.bazar.bazarAPIREST.model.Bazar;

import java.util.List;

public interface IBazarService {
    public List<Bazar> getTraerProductos();
    public String saveProduct(Bazar bazar);
    public String deletProduct(Long id);
    public Bazar findProduct(Long id);
}
