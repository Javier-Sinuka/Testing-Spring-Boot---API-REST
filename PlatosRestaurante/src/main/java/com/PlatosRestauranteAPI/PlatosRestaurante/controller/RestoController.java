package com.PlatosRestauranteAPI.PlatosRestaurante.controller;

import com.PlatosRestauranteAPI.PlatosRestaurante.model.Restaurante;
import com.PlatosRestauranteAPI.PlatosRestaurante.service.IRestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RestoController {
    @Autowired
    private IRestoService interResto;
    //generamos un parametro para hacer
    //las llamadas a los metodos generados en RestoService

    @GetMapping ("/restaurante/lista_platos_disponibles")
    public List<Restaurante> getPlatosDisponiblesMostrar(){
        return interResto.getPlatosDisponibles();
    }

    @GetMapping ("/restaurante/plato_pedido/{id}")
    public Restaurante getPlatoEspecifico(@PathVariable Long id){
        Restaurante c = interResto.consultaPlatoById(id);
        return c;
    }

    @PostMapping ("/restaurante/ingresar_plato")
    public String guardarNuevoPlato(@RequestBody Restaurante restaurante){
        interResto.saveNewPlato(restaurante);
        return "Plato guardado con exito";
    }

    @DeleteMapping ("/restaurante/eliminar_plato_existente/{id}")
    public void eliminarPlatoExistente(@PathVariable Long id){
        interResto.deletePlato(id);
    }
}
