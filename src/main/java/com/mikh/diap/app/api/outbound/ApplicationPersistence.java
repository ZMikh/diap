package com.mikh.diap.app.api.outbound;

import com.mikh.diap.app.exception.ApplicationNotFoundException;
import com.mikh.diap.domain.ApplicationState;
import com.mikh.diap.domain.HuntingApplication;

import java.util.List;

public interface ApplicationPersistence {
    HuntingApplication save(HuntingApplication huntingApplication);

    List<HuntingApplication> findAll();

    void deleteById(Long id);

    HuntingApplication findById(Long id) throws ApplicationNotFoundException;

    List<HuntingApplication> findAllByHuntingLicenseSeriesAndNumber(String huntingLicenseSeries, Long huntingLicenseNumber);

    HuntingApplication findByStatusAndOrderByDateTime(ApplicationState applicationState);
}
