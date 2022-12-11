package com.bazar.bazarAPIREST.controller;

import com.bazar.bazarAPIREST.model.Bazar;
import com.bazar.bazarAPIREST.service.IBazarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BazarController {
    @Autowired
    private IBazarService iBazarService;

    @GetMapping ("/productos/traer")
    public List<Bazar> getTraer(){
        return iBazarService.getTraerProductos();
    }

    @GetMapping ("/productos/traer/{id}")
    public Bazar getTraerEspecifico(@PathVariable Long id){
        return iBazarService.findProduct(id);
    }

    @GetMapping ("/productos/traer/mas_barato")
    public Bazar getProductoMasBarato(){
        List<Bazar> listaProductos = iBazarService.getTraerProductos();
        int counter = 10000000;
        Long id = listaProductos.get(0).getId();
        for(Bazar b : listaProductos){
            if(b.getPrecio_producto() <= counter){
                counter = b.getPrecio_producto();
                id = b.getId();
            }
        }
        return getTraerEspecifico(id);
    }

    @GetMapping ("/productos/traer/mas_caro")
    public Bazar getProductoMasCaro(){
        List<Bazar> listaProductos = iBazarService.getTraerProductos();
        int counter = 0;
        Long id = listaProductos.get(0).getId();
        for(Bazar b : listaProductos){
            if(b.getPrecio_producto() >= counter){
                counter = b.getPrecio_producto();
                id = b.getId();
            }
        }
        return getTraerEspecifico(id);
    }

    @PostMapping ("/productos/crear")
    public String crearProducto(@RequestBody Bazar bazar){
        return iBazarService.saveProduct(bazar);
    }

    @DeleteMapping ("/productos/eliminar/{id}")
    public String eliminarProducto(@PathVariable Long id){
        return iBazarService.deletProduct(id);
    }


}
