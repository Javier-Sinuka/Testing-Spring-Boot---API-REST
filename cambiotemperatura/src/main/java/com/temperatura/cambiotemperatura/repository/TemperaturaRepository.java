package com.temperatura.cambiotemperatura.repository;

import com.temperatura.cambiotemperatura.model.Temperatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemperaturaRepository extends JpaRepository<Temperatura, Long> {
}
