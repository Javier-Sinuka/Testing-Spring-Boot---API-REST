package com.miaplicacion.primerproyecto.Controller;

import com.miaplicacion.primerproyecto.Controller.Cliente.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

//    @GetMapping("/hola/{nombre}/{edad}/{profesion}")
//    public String decirHola(@RequestParam String nombre,
//    @RequestParam int edad, @RequestParam String profesion){
//        return "Hola mundo! Tu nombre es: " + nombre +
//                " Tu edad es: " + edad + " y tu profesion es: " + profesion;
//    }
    @GetMapping("/pruebaresponse")
    ResponseEntity<String> traerRespuestas(){
        return new ResponseEntity<>("Esto es un mensaje Response Entity", HttpStatus.OK); // Retornar con ResponseEntity
    }


    @GetMapping ("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerClientes(){
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1L,"Javier", "Sinuka"));
        listaClientes.add(new Cliente(2L,"Melisa", "Di Pinto"));
        listaClientes.add(new Cliente(3L,"Alejandro", "Di Pinto"));
        return listaClientes;
    }

    @PostMapping ("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli){
        //lo que hara el metodo
        System.out.println("Datos cliente: " + cli.getNombre() + " Apellido: " + cli.getApellido());
    }
}
