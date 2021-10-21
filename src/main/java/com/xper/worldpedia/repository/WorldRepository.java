package com.xper.worldpedia.repository;

import com.xper.worldpedia.models.WorldEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorldRepository extends JpaRepository<WorldEntity , Long> {
    WorldEntity findByCountry(String country);
    boolean existsByCountry(String country);
}
