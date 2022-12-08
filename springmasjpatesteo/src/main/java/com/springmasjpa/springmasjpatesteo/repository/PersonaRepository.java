package com.springmasjpa.springmasjpatesteo.repository;

import com.springmasjpa.springmasjpatesteo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//La interface extiende de JpaRepository (que maneja repositorios JPA)
//en los parametro <> deben ir: <clase a persistir, tipo de dato de su ID>
@Repository //Mapeamos com repositorio
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
