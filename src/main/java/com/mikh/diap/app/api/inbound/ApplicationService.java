package com.mikh.diap.app.api.inbound;

import com.mikh.diap.app.exception.ApplicationInformationException;
import com.mikh.diap.app.exception.ApplicationNotFoundException;
import com.mikh.diap.domain.HuntingApplication;

import java.util.List;

public interface ApplicationService {

    List<HuntingApplication> getAll();

    HuntingApplication getApplicationById(Long id) throws ApplicationNotFoundException;

    HuntingApplication addApplication(Long id, HuntingApplication huntingApplication) throws ApplicationInformationException;

    HuntingApplication updateApplication(Long id, UpdateApplicationRequest updateApplicationRequest) throws ApplicationNotFoundException;

    void deleteApplicationById(Long id);
}
