package com.PlatosRestauranteAPI.PlatosRestaurante.repository;

import com.PlatosRestauranteAPI.PlatosRestaurante.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestoRepository extends JpaRepository<Restaurante,Long> {
}
