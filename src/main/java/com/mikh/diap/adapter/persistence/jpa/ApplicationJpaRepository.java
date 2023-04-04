package com.mikh.diap.adapter.persistence.jpa;

import com.mikh.diap.domain.HuntingApplication;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ApplicationJpaRepository extends JpaRepository<HuntingApplication, Long> {
    @EntityGraph(value = "Application.resource")
    @Override
    Optional<HuntingApplication> findById(Long aLong);

    @EntityGraph(value = "Application.resource")
    @Override
    List<HuntingApplication> findAll();
}
