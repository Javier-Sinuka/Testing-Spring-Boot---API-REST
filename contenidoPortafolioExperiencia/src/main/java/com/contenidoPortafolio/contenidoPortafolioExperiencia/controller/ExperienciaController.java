package com.contenidoPortafolio.contenidoPortafolioExperiencia.controller;

import com.contenidoPortafolio.contenidoPortafolioExperiencia.dto.ExperienciaDto;
import com.contenidoPortafolio.contenidoPortafolioExperiencia.dto.Mensaje;
import com.contenidoPortafolio.contenidoPortafolioExperiencia.model.Experiencia;
import com.contenidoPortafolio.contenidoPortafolioExperiencia.service.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contenido_experiencia")
@CrossOrigin (origins = "http://localhost:4200") //Rutting a Angular y su  puerto
public class ExperienciaController {
    @Autowired
    ExperienciaService experienciaService;

    @GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> list(){
        List<Experiencia> list = experienciaService.list();
        return new ResponseEntity<List<Experiencia>>(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id") long id){
        if(!experienciaService.existsById(id)){
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Experiencia experiencia = experienciaService.getOne(id).get();
        return new ResponseEntity<Experiencia>(experiencia, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody ExperienciaDto experienciaDto){
        if(experienciaDto.getNombreExperiencia().equals("")){
            return new ResponseEntity(new Mensaje("El nombre de la Experiencia es Obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(experienciaDto.getLugarExperiencia().equals("")){
            return new ResponseEntity(new Mensaje("El lugar de la Experiencia es Obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(experienciaDto.getModalidadExperiencia().equals("")){
            return new ResponseEntity(new Mensaje("La modalidad de la Experiencia es Obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(experienciaDto.getTiempoExperiencia()==0 || experienciaDto.getTiempoExperiencia()<0){
            return new ResponseEntity(new Mensaje("El tiempo de la Experiencia es Obligatorio y debe NO SER NEGATIVO."), HttpStatus.BAD_REQUEST);
        }
        if(experienciaDto.getContenidoExperiencia().equals("")){
            return new ResponseEntity(new Mensaje("El contenido de la Experiencia es Obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Experiencia experiencia = new Experiencia(experienciaDto.getNombreExperiencia(), experienciaDto.getModalidadExperiencia(), experienciaDto.getLugarExperiencia() , experienciaDto.getTiempoExperiencia(), experienciaDto.getContenidoExperiencia());
        experienciaService.save(experiencia);

        return new ResponseEntity(new Mensaje("Experiencia creada correctamente"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable ("id") long id, @RequestBody ExperienciaDto experienciaDto){
        if(!experienciaService.existsById(id)){
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        if(experienciaDto.getNombreExperiencia()==null){
            return new ResponseEntity(new Mensaje("El nombre de la Experiencia es Obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(experienciaDto.getLugarExperiencia()==null){
            return new ResponseEntity(new Mensaje("El lugar de la Experiencia es Obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(experienciaDto.getModalidadExperiencia()==null){
            return new ResponseEntity(new Mensaje("La modalidad de la Experiencia es Obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(experienciaDto.getTiempoExperiencia()==0 || experienciaDto.getTiempoExperiencia()<0){
            return new ResponseEntity(new Mensaje("El tiempo de la Experiencia es Obligatorio y debe NO SER NEGATIVO."), HttpStatus.BAD_REQUEST);
        }
        if(experienciaDto.getContenidoExperiencia()==null){
            return new ResponseEntity(new Mensaje("El contenido de la Experiencia es Obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Experiencia experiencia = experienciaService.getOne(id).get();
        experiencia.setContenidoExperiencia(experienciaDto.getContenidoExperiencia());
        experiencia.setLugarExperiencia(experienciaDto.getLugarExperiencia());
        experiencia.setModalidadExperiencia(experienciaDto.getModalidadExperiencia());
        experiencia.setNombreExperiencia(experienciaDto.getNombreExperiencia());
        experiencia.setTiempoExperiencia(experienciaDto.getTiempoExperiencia());

        return new ResponseEntity(new Mensaje("Experiencia Actualizada"), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable ("id") long id){
        if(!experienciaService.existsById(id)){
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        experienciaService.delete(id);
        return new ResponseEntity(new Mensaje("Experiencia Eliminada"), HttpStatus.OK);
    }
}
