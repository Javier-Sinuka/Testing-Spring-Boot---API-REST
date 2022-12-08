package com.manejo_fecha.manejo_fecha.repository;

import com.manejo_fecha.manejo_fecha.model.EdadActual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdadActualRepository extends JpaRepository<EdadActual, Long> {
}
