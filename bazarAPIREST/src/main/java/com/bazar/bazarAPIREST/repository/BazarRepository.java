package com.bazar.bazarAPIREST.repository;

import com.bazar.bazarAPIREST.model.Bazar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BazarRepository extends JpaRepository<Bazar, Long> {
}
