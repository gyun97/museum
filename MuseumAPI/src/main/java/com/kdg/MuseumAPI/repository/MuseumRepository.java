package com.kdg.MuseumAPI.repository;

import com.kdg.MuseumAPI.entity.MuseumEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MuseumRepository extends JpaRepository<MuseumEntity, Long> {
}
