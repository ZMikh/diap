package com.mikh.diap.adapter.persistence.jpa;

import com.mikh.diap.domain.ApplicationState;
import com.mikh.diap.domain.HuntingApplication;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ApplicationJpaRepository extends JpaRepository<HuntingApplication, Long> {
    @EntityGraph(value = "Application.resource")
    @Override
    Optional<HuntingApplication> findById(Long aLong);

    @EntityGraph(value = "Application.resource")
    @Override
    List<HuntingApplication> findAll();

    @Query("SELECT app FROM HuntingApplication app WHERE app.huntingLicenseSeries = ?1 AND app.huntingLicenseNumber = ?2")
    List<HuntingApplication> findAllByHuntingLicenseSeriesAndNumber(String huntingLicenseSeries, Long huntingLicenseNumber);

    @EntityGraph(value = "Application.resource")
    @Query("SELECT app FROM HuntingApplication app WHERE app.applicationState = ?1 ORDER BY app.creationDate LIMIT 1")
    HuntingApplication findByStateAndOrderByDateTime(ApplicationState applicationState);
}
